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
	
	@Transactional(readOnly = true)
	public List<MeetingDTO> findAllMeetings(){
		List<Meeting> entity = repository.findAll();
		return entity.stream().map(x -> new MeetingDTO(x, x.getCanticles(), x.getPrayers(), x.getSessions())).collect(Collectors.toList());
	}
		
}
