package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.repositories.MeetingRepository;

@Service
public class MeetingService {
	
	@Autowired
	private MeetingRepository repository;
	
	//@Autowired
	//private PresidencyRepository presidencyRepository; 
	
	@Transactional(readOnly = true)
	public List<MeetingDTO> findAllMeetings(){
		List<Meeting> entity = repository.findAll();
		return entity.stream().map(x -> new MeetingDTO(x, x.getCanticles(), x.getPrayers(), x.getSessions())).collect(Collectors.toList());
	}
	
	public MeetingDTO insert(MeetingDTO dto) {
		Meeting meeting = new Meeting();
		meeting.setDate(dto.getDate());
					
		meeting = repository.save(meeting);
		return new MeetingDTO(meeting.getId(), meeting.getDate());
	}
		
}
