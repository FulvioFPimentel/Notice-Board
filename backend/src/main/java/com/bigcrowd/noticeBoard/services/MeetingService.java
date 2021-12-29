package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.MeetingAllDataDTO;
import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.repositories.MeetingRepository;

@Service
public class MeetingService {
		
	@Autowired
	private MeetingRepository meetingRepository;
	
	@Transactional(readOnly = true)
	public List<MeetingDTO> findAll() {
		List<Meeting> meetings = meetingRepository.findAll();
		return meetings.stream().map(x -> new MeetingDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Page<MeetingAllDataDTO> findAllPaged(PageRequest pageRequest){
		Page<Meeting> meetings = meetingRepository.findPaged(pageRequest);
		return meetings.map(entity -> new MeetingAllDataDTO(entity, entity.getCanticles(), entity.getPrayers(), entity.getSessions()));
		
	}

	@Transactional(readOnly = true)
	public MeetingAllDataDTO findById(Long id) {
		Optional<Meeting> meeting = meetingRepository.findById(id);
		Meeting entity = meeting.orElseThrow(() -> new NullPointerException("Entity not Found"));
		return new MeetingAllDataDTO(entity, entity.getCanticles(), entity.getPrayers(), entity.getSessions());
	}
	
	public MeetingDTO insert(MeetingDTO dto) {
		Meeting meeting = new Meeting();
		meeting.setDate(dto.getDate());
		meeting = meetingRepository.save(meeting);
		return new MeetingDTO(meeting);
	}

}
