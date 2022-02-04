package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.MeetingSaveDTO;
import com.bigcrowd.noticeBoard.entities.Assignment;
import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Presidency;
import com.bigcrowd.noticeBoard.repositories.AssignmentRepository;
import com.bigcrowd.noticeBoard.repositories.MeetingRepository;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;
import com.bigcrowd.noticeBoard.repositories.PresidencyRepository;

@Service
public class MeetingService {
	
	@Autowired
	private MeetingRepository repository;
	
	@Autowired
	private AssignmentRepository assignmentRepository;
	
	@Autowired
	private PersonRepository personRepository; 
	 
	@Autowired
	private PresidencyRepository presidencyRepository; 
	
	@Transactional(readOnly = true)
	public List<MeetingDTO> findAllMeetings(){
		List<Meeting> entity = repository.findAll();
		return entity.stream().map(x -> new MeetingDTO(x, x.getCanticles(), x.getPrayers(), x.getSessions())).collect(Collectors.toList());
	}
	
	@Transactional
	public MeetingSaveDTO insert(MeetingSaveDTO dto) {
	
		Meeting meeting = new Meeting();
	
		Assignment assignment = assignmentRepository.getById(dto.getPresidency().getDesignation().getAssignment().getId());
		Person person = personRepository.getById(dto.getPresidency().getDesignation().getPerson().getId());
		
		Designation designation = new Designation();
		designation.setAssignment(assignment);
		designation.setPerson(person);
		
		Presidency presidency = new Presidency();
		presidency.setDesignation(designation);	
		presidency.setMeeting(meeting);
		presidency = presidencyRepository.saveAndFlush(presidency);
		
		meeting.setDate(dto.getDate());
		meeting.setPresidency(presidency);
		
		meeting = repository.saveAndFlush(meeting);
		return new MeetingSaveDTO(meeting, presidency);
	}
		
}
