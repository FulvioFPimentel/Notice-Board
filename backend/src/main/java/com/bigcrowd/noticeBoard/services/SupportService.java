package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.SupportDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.DesignationSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.SupportSaveDTO;
import com.bigcrowd.noticeBoard.entities.Assignment;
import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Support;
import com.bigcrowd.noticeBoard.repositories.AssignmentRepository;
import com.bigcrowd.noticeBoard.repositories.DesignationRepository;
import com.bigcrowd.noticeBoard.repositories.MeetingRepository;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;
import com.bigcrowd.noticeBoard.repositories.SupportRepository;

@Service
public class SupportService {
	
	@Autowired
	private SupportRepository supportRepository;
	
	@Autowired
	private MeetingRepository meetingRepository;
	
	@Autowired
	private AssignmentRepository assignmentRepository;
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private DesignationRepository designationRepository;
	
	@Transactional(readOnly = true)
	public List<SupportDTO> findAllSupports(){
		List<Support> supports = supportRepository.findAll();
		return supports.stream().map(x -> new SupportDTO(x, x.getDesignations())).collect(Collectors.toList());
	}
	
	@Transactional
	public SupportDTO saveSupport(SupportSaveDTO dto) {
		
		Meeting meeting = meetingRepository.getById(dto.getMeetingId());
		
		Support support = new Support();
		support.setMeeting(meeting);
		
		for(DesignationSaveDTO desg: dto.getDesignations()) {
			
			Assignment Assignment = assignmentRepository.getById(desg.getAssignment().getId());
			Person person = personRepository.getById(desg.getPerson().getId());
			
			Designation designation = new Designation();
			designation.setAssignment(Assignment);
			designation.setPerson(person);
			
			designation = designationRepository.saveAndFlush(designation);
			
			support.getDesignations().add(designation);
			
		}
		
		support = supportRepository.saveAndFlush(support);
		
		return new SupportDTO(support, support.getDesignations());
	}
	
}
