package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.CanticleSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.MeetingSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.PrayerSaveDTO;
import com.bigcrowd.noticeBoard.entities.Assignment;
import com.bigcrowd.noticeBoard.entities.Canticle;
import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Prayer;
import com.bigcrowd.noticeBoard.entities.Presidency;
import com.bigcrowd.noticeBoard.repositories.AssignmentRepository;
import com.bigcrowd.noticeBoard.repositories.CanticleRepository;
import com.bigcrowd.noticeBoard.repositories.MeetingRepository;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;
import com.bigcrowd.noticeBoard.repositories.PrayerRepository;
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
	
	@Autowired
	private CanticleRepository canticleRepository;
	
	@Autowired
	private PrayerRepository prayerRepository; 
	
	//@Autowired
	//private SubSessionRepository subSessionRepository; 
	
	//@Autowired
	//private SessionRepository sessionRepository;
	
	//@Autowired
	//private DesignationRepository designationRepository;
	
	@Transactional(readOnly = true)
	public List<MeetingDTO> findAllMeetings(){
		List<Meeting> entity = repository.findAll();
		return entity.stream().map(x -> new MeetingDTO(x, x.getCanticles(), x.getPrayers(), x.getSegmentations())).collect(Collectors.toList());
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
		
		for(CanticleSaveDTO cDto:  dto.getCanticles()) {
			Canticle canticle = canticleRepository.getById(cDto.getId());
			meeting.getCanticles().add(canticle);
		}
		
		for(PrayerSaveDTO pDto: dto.getPrayers()) {
			Assignment prayerAssignment = assignmentRepository.getById(pDto.getDesignation().getAssignment().getId());
			Person prayerPerson = personRepository.getById(pDto.getDesignation().getPerson().getId());
			
			Designation prayerDesignation = new Designation();
			prayerDesignation.setAssignment(prayerAssignment);
			prayerDesignation.setPerson(prayerPerson);
			
			Prayer prayer = new Prayer();
			prayer.setMoment(pDto.getMoment());
			prayer.setDesignation(prayerDesignation);
			prayer.setMeeting(meeting);
			prayer = prayerRepository.saveAndFlush(prayer);
			meeting.getPrayers().add(prayer);
		}
		
		//for(SessionSaveDTO sDto: dto.getSessions()) {
			
		//}
		
		
		meeting.setDate(dto.getDate());
		meeting.setPresidency(presidency);
		
		meeting = repository.saveAndFlush(meeting);
		return new MeetingSaveDTO(meeting, presidency);
	}
		
}
