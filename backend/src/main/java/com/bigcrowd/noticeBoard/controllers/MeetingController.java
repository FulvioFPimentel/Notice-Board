package com.bigcrowd.noticeBoard.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bigcrowd.noticeBoard.dto.MeetingDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.MeetingSaveDTO;
import com.bigcrowd.noticeBoard.services.MeetingService;

@RestController
@RequestMapping(value = "/meetings")
public class MeetingController {
			
	@Autowired
	private MeetingService service;
	
	@GetMapping
	public ResponseEntity<List<MeetingDTO>> findAll(){
		List<MeetingDTO> meetings = service.findAllMeetings();
		return ResponseEntity.ok().body(meetings);
	}
	
	@GetMapping(value = "/page")
	public ResponseEntity<Page<MeetingDTO>> findAllPaged(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "5") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "date") String orderBy
			) {
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Page<MeetingDTO> meeting = service.findAllPaged(pageRequest);		
		return ResponseEntity.ok().body(meeting);
	}
	
	@PostMapping
	public ResponseEntity<MeetingSaveDTO> insert(@RequestBody MeetingSaveDTO dto){		
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<MeetingSaveDTO> update(@PathVariable Long id, @RequestBody MeetingSaveDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<MeetingSaveDTO> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
