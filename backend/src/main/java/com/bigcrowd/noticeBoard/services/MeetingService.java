package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.CanticleSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.DesignationSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.MeetingSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.PrayerSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.SessionSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.SubSessionSaveDTO;
import com.bigcrowd.noticeBoard.entities.Assignment;
import com.bigcrowd.noticeBoard.entities.Canticle;
import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Prayer;
import com.bigcrowd.noticeBoard.entities.Presidency;
import com.bigcrowd.noticeBoard.entities.Segmentation;
import com.bigcrowd.noticeBoard.entities.Session;
import com.bigcrowd.noticeBoard.entities.SubSession;
import com.bigcrowd.noticeBoard.repositories.AssignmentRepository;
import com.bigcrowd.noticeBoard.repositories.CanticleRepository;
import com.bigcrowd.noticeBoard.repositories.DesignationRepository;
import com.bigcrowd.noticeBoard.repositories.MeetingRepository;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;
import com.bigcrowd.noticeBoard.repositories.PrayerRepository;
import com.bigcrowd.noticeBoard.repositories.PresidencyRepository;
import com.bigcrowd.noticeBoard.repositories.SegmantationRepository;
import com.bigcrowd.noticeBoard.repositories.SessionRepository;
import com.bigcrowd.noticeBoard.repositories.SubSessionRepository;

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
	
	@Autowired
	private SubSessionRepository subSessionRepository; 
	
	@Autowired
	private SessionRepository sessionRepository;
	
	@Autowired
	private DesignationRepository designationRepository;
	
	@Autowired
	private SegmantationRepository segmentationRepository;
	
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
		
		for(SessionSaveDTO sDto: dto.getSessions()) {
			Session session = sessionRepository.getById(sDto.getId());
			
			for (SubSessionSaveDTO ssDto: sDto.getSubsessions()) {
				SubSession subsession = subSessionRepository.getById(ssDto.getId());
				
					Segmentation segmantation = new Segmentation();
					segmantation.setMeeting(meeting);
					segmantation.setSession(session);
					segmantation.setSubSession(subsession);
					segmantation = segmentationRepository.saveAndFlush(segmantation);
					for(DesignationSaveDTO dDto: ssDto.getDesignations()) {
						
						Person subPerson = personRepository.getById(dDto.getPerson().getId());
						Assignment subAssignment = assignmentRepository.getById(dDto.getAssignment().getId());		
						
						Designation subDesignation = new Designation();
						subDesignation.setPerson(subPerson);
						subDesignation.setAssignment(subAssignment);
						subDesignation.getSegmentations().add(segmantation);
						subDesignation = designationRepository.saveAndFlush(subDesignation);		
					}

					meeting.getSegmentations().add(segmantation);
			}
		}
		
		meeting.setDate(dto.getDate());
		meeting.setPresidency(presidency);
		meeting = repository.saveAndFlush(meeting);
		return new MeetingSaveDTO(meeting, presidency);
	}
	
	@Transactional
	public MeetingSaveDTO update(Long id, MeetingSaveDTO dto) {
		
		Meeting meeting = repository.getById(id);
		
		Assignment assignment = assignmentRepository.getById(dto.getPresidency().getDesignation().getAssignment().getId());
		Person person = personRepository.getById(dto.getPresidency().getDesignation().getPerson().getId());
		
		Designation desigPresidency = designationRepository.getById(meeting.getPresidency().getDesignation().getId());
		
		desigPresidency.setAssignment(assignment);
		desigPresidency.setPerson(person);
		desigPresidency = designationRepository.saveAndFlush(desigPresidency);
		
		Presidency presidency = presidencyRepository.getById(meeting.getPresidency().getId());
		presidency.setMeeting(meeting);
		presidency.setDesignation(desigPresidency);
		presidency = presidencyRepository.saveAndFlush(presidency);
			
		meeting.getCanticles().clear();
		for(CanticleSaveDTO cDto:  dto.getCanticles()) {
			Canticle canticle = canticleRepository.getById(cDto.getId());
			canticle = canticleRepository.saveAndFlush(canticle);
			meeting.getCanticles().add(canticle);
		}
		
		meeting.getPrayers().clear();
		for(PrayerSaveDTO pDto: dto.getPrayers()) {
			Assignment prayerAssignment = assignmentRepository.getById(pDto.getDesignation().getAssignment().getId());
			Person prayerPerson = personRepository.getById(pDto.getDesignation().getPerson().getId());
			
			Designation prayerDesignation = designationRepository.getById(pDto.getDesignation().getId());
			prayerDesignation.setAssignment(prayerAssignment);
			prayerDesignation.setPerson(prayerPerson);
			
			Prayer prayer = prayerRepository.getById(pDto.getId());
			prayer.setMoment(pDto.getMoment());
			prayer.setDesignation(prayerDesignation);
			prayer.setMeeting(meeting);
			prayer = prayerRepository.saveAndFlush(prayer);
			meeting.getPrayers().add(prayer);
		}
		
		long sessionID = 0;
		
		for(SessionSaveDTO sDTO: dto.getSessions()) {
			for(Segmentation s: meeting.getSegmentations()) {
				
				if(sDTO.getId() == s.getSession().getId()) {
					if(sessionID == 0 || sessionID != sDTO.getId()) {
						Session session = sessionRepository.getById(s.getSession().getId());
						sessionID = sDTO.getId();
						session.setSession(sDTO.getSession());
						session = sessionRepository.saveAndFlush(session);
					}
				}
			}
			
			for (SubSessionSaveDTO ssDTO: sDTO.getSubsessions()) {
				for(Segmentation s: meeting.getSegmentations()) {
					
					if(ssDTO.getId() == s.getSubSession().getId()) {
						SubSession subsession = subSessionRepository.getById(s.getSubSession().getId());
						subsession.setSubSession(ssDTO.getSubSession());
						subsession = subSessionRepository.saveAndFlush(subsession);
					}
				}
				
				for(DesignationSaveDTO dDTO: ssDTO.getDesignations()) {
					long designationID = 0;
					for(Segmentation s: meeting.getSegmentations()) {
						
						for(Designation desig: s.getDesignations()) {
							if(designationID != dDTO.getId() && desig.getId() == dDTO.getId()) {
								
								Designation designation = designationRepository.getById(desig.getId());
								Person personDesig = personRepository.getById(dDTO.getPerson().getId());
								Assignment assignmentDesig = assignmentRepository.getById(dDTO.getAssignment().getId());
								
								designation.setPerson(personDesig);
								designation.setAssignment(assignmentDesig);
								designation = designationRepository.saveAndFlush(designation);
							}
						}
					}	
				}
			}
		}
			
		meeting.setDate(dto.getDate());
		meeting = repository.saveAndFlush(meeting);
		return new MeetingSaveDTO(meeting);
	}
	
	public void delete(Long id) {
		try {
			
			Meeting meeting = repository.getById(id);
			
			designationRepository.deleteById(meeting.getPresidency().getDesignation().getId());
			//presidencyRepository.deleteById(meeting.getPresidency().getId());
			
			for(Prayer prayer: meeting.getPrayers()) {
				designationRepository.deleteById(prayer.getDesignation().getId());
				prayerRepository.deleteById(prayer.getId());
			}
			meeting.getCanticles().clear();
			meeting.getPrayers().clear();
			
			
			List<Segmentation> seg = segmentationRepository.findByMeeting(meeting);
			
			for(Segmentation s: seg) {
				for(Designation des: s.getDesignations()) {		
					designationRepository.deleteById(des.getId());
				}
			}
			
			segmentationRepository.deleteSegmentation(meeting);
			// repository.deleteById(id);
			
						
		} catch(RuntimeException e) {
			e.getMessage();
		}
		
	}	
}
