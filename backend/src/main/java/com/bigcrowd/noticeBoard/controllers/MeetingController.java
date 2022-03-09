package com.bigcrowd.noticeBoard.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
