package com.bigcrowd.noticeBoard.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.CanticlesPerMeetingsDTO;
import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.DesignationSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.MeetingSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.PrayerSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.SessionSaveDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.SubSessionSaveDTO;
import com.bigcrowd.noticeBoard.entities.Assignment;
import com.bigcrowd.noticeBoard.entities.Canticle;
import com.bigcrowd.noticeBoard.entities.CanticlesPerMeetings;
import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Prayer;
import com.bigcrowd.noticeBoard.entities.Presidency;
import com.bigcrowd.noticeBoard.entities.Segmentation;
import com.bigcrowd.noticeBoard.entities.Session;
import com.bigcrowd.noticeBoard.entities.SubSession;
import com.bigcrowd.noticeBoard.entities.Support;
import com.bigcrowd.noticeBoard.repositories.AssignmentRepository;
import com.bigcrowd.noticeBoard.repositories.CanticlePerMeetingsRepository;
import com.bigcrowd.noticeBoard.repositories.CanticleRepository;
import com.bigcrowd.noticeBoard.repositories.DesignationRepository;
import com.bigcrowd.noticeBoard.repositories.MeetingRepository;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;
import com.bigcrowd.noticeBoard.repositories.PrayerRepository;
import com.bigcrowd.noticeBoard.repositories.PresidencyRepository;
import com.bigcrowd.noticeBoard.repositories.SegmantationRepository;
import com.bigcrowd.noticeBoard.repositories.SessionRepository;
import com.bigcrowd.noticeBoard.repositories.SubSessionRepository;
import com.bigcrowd.noticeBoard.repositories.SupportRepository;

@Service
public class MeetingService {
	
	@Autowired
	private AuthService authService;
	
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
	private CanticlePerMeetingsRepository canticlePerMeetingsRepository;
	
	@Autowired
	private DesignationRepository designationRepository;
	
	@Autowired
	private SegmantationRepository segmentationRepository;
	
	@Autowired
	private SupportRepository supportRepository; 
	
	@Transactional(readOnly = true)
	public List<MeetingDTO> findAllMeetings(){
		List<Meeting> entity = repository.findAll();
		return entity.stream().map(x -> new MeetingDTO(x, x.getCanticlesPerMeetings(), x.getPrayers(), x.getSegmentations())).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Page<MeetingDTO> findAllPaged(PageRequest pageRequest) {
		Page<Meeting> meeting = repository.findAll(pageRequest);
		return meeting.map(x -> new MeetingDTO(x, x.getCanticlesPerMeetings(), x.getPrayers(), x.getSegmentations()));
	}
	
	@Transactional
	public MeetingSaveDTO insert(MeetingSaveDTO dto) {
		authService.validateAdmin();
		
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
		
		for(CanticlesPerMeetingsDTO cDto:  dto.getCanticlesPerMeetings()) {
			
			CanticlesPerMeetings canticlePerMeetings = new CanticlesPerMeetings();
			
			Canticle canticle = canticleRepository.getById(cDto.getCanticle().getId());
			
			canticlePerMeetings.setMeeting(meeting);
			canticlePerMeetings.setCanticle(canticle);
			canticlePerMeetings.setMoment(cDto.getMoment());
			
			canticlePerMeetings = canticlePerMeetingsRepository.saveAndFlush(canticlePerMeetings); 
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
		
		Session session;
		for(SessionSaveDTO sDto: dto.getSessions()) {
			if(sDto.getId() == null) {
				session = new Session();
				session.setSession(sDto.getSession());
				sessionRepository.saveAndFlush(session);
			} else {
				session = sessionRepository.getById(sDto.getId());
			}
			
			for (SubSessionSaveDTO ssDto: sDto.getSubsessions()) {
				SubSession subsession;
				if(ssDto.getId() == null) {
					subsession = new SubSession();
					subsession.setSubSession(ssDto.getSubSession());
					subSessionRepository.saveAndFlush(subsession);
				} else {
					subsession = subSessionRepository.getById(ssDto.getId());
				}
				
					Segmentation segmentation = new Segmentation();
					segmentation.setMeeting(meeting);
					segmentation.setSession(session);
					segmentation.setSubSession(subsession);
					segmentation.setMoment(ssDto.getMoment());
					segmentation.setTime(ssDto.getTime());
					segmentation = segmentationRepository.saveAndFlush(segmentation);
					for(DesignationSaveDTO dDto: ssDto.getDesignations()) {
						
						Person subPerson = personRepository.getById(dDto.getPerson().getId());
						Assignment subAssignment = assignmentRepository.getById(dDto.getAssignment().getId());		
						
						Designation subDesignation = new Designation();
						subDesignation.setPerson(subPerson);
						subDesignation.setAssignment(subAssignment);
						subDesignation.getSegmentations().add(segmentation);
						subDesignation = designationRepository.saveAndFlush(subDesignation);		
					}

					meeting.getSegmentations().add(segmentation);
			}
		}
		
		meeting.setDate(dto.getDate());
		meeting.setTitle(dto.getTitle());
		meeting.setPresidency(presidency);
		meeting = repository.saveAndFlush(meeting);
		return new MeetingSaveDTO(meeting, presidency);
	}
	
	@Transactional
	public MeetingSaveDTO update(Long id, MeetingSaveDTO dto) {
		
		authService.validateAdmin();
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
			
		meeting.getCanticlesPerMeetings().clear();
		for(CanticlesPerMeetingsDTO cDto:  dto.getCanticlesPerMeetings()) {
			CanticlesPerMeetings canticlesPerMeetings = canticlePerMeetingsRepository.getById(cDto.getCanticle().getId());
			canticlesPerMeetings = canticlePerMeetingsRepository.saveAndFlush(canticlesPerMeetings);
			meeting.getCanticlesPerMeetings().add(canticlesPerMeetings);
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
		meeting.setTitle(dto.getTitle());
		meeting = repository.saveAndFlush(meeting);
		return new MeetingSaveDTO(meeting);
	}
	
	public void delete(Long id) {
		authService.validateAdmin();
		try {
			
			Meeting meeting = repository.getById(id);
			
			for(Support sub: meeting.getSupports()) {
				
				List<Designation> desig = new ArrayList<>();
				sub.getDesignations().forEach(x -> desig.add(x));
				
				sub.getDesignations().clear();
				for(Designation des: desig) {
					designationRepository.delete(designationRepository.getById(des.getId()));
				}
				supportRepository.deleteById(sub.getId());
			} 
			
			for(Prayer prayer: meeting.getPrayers()) {
				designationRepository.deleteById(prayer.getDesignation().getId());
				prayerRepository.deleteById(prayer.getId());
			}
			meeting.getCanticlesPerMeetings().clear();
			meeting.getPrayers().clear();
						
			List<Segmentation> seg = segmentationRepository.findByMeeting(meeting);
			
			for(Segmentation s: seg) {
				for(Designation des: s.getDesignations()) {		
					designationRepository.deleteById(des.getId());
				}
				segmentationRepository.deleteById(s.getId());
			}
			
			designationRepository.deleteById(meeting.getPresidency().getDesignation().getId());
			presidencyRepository.deleteById(meeting.getPresidency().getId());
			
			repository.deleteById(id);
							
		} catch(RuntimeException e) {
			e.getMessage();
		}
		
	}
	
	//Meeting meeting, Set<Canticle> canticles, List<Prayer> prayers, Set<Segmentation> Segmentations

	@Transactional(readOnly = true)
	public MeetingDTO findById(Long id) {
		Meeting meeting = repository.getById(id);
		return new MeetingDTO(meeting, meeting.getCanticlesPerMeetings(), meeting.getPrayers(), meeting.getSegmentations());
	}	
}
