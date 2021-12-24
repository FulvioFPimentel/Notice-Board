package com.bigcrowd.noticeBoard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bigcrowd.noticeBoard.dto.MeetingAllDataDTO;
import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.services.MeetingService;

@RestController
@RequestMapping(value = "/meetings")
public class MeetingController {
	
	@Autowired
	private MeetingService meetingService;
	
	@GetMapping
	public ResponseEntity<Page<MeetingAllDataDTO>> findAllPaged(
				@RequestParam(value = "page", defaultValue= "0") Integer page,
				@RequestParam(value = "itemsPerPage", defaultValue = "5") Integer itemsPerPage,
				@RequestParam(value = "direction", defaultValue = "ASC") String direction,
				@RequestParam(value = "orderBy", defaultValue = "date") String orderBy
			) {
		PageRequest pageRequest = PageRequest.of(page, itemsPerPage, Direction.valueOf(direction), orderBy);
		Page<MeetingAllDataDTO> list = meetingService.findAllPaged(pageRequest);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/list")
	public ResponseEntity<List<MeetingDTO>> findAll() {
		List<MeetingDTO> meetings = meetingService.findAll();
		return ResponseEntity.ok().body(meetings);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MeetingAllDataDTO> findToDate(@PathVariable Long id){
		MeetingAllDataDTO meeting = meetingService.findById(id);
		return ResponseEntity.ok().body(meeting);	
	}
}
