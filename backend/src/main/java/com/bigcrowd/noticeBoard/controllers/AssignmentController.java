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

import com.bigcrowd.noticeBoard.dto.AssignmentInfoDTO;
import com.bigcrowd.noticeBoard.services.AssignmentService;

@RestController
@RequestMapping(value = "/assignments")
public class AssignmentController {
	
	@Autowired
	private AssignmentService assignmentService;
	
	@GetMapping
	public ResponseEntity<List<AssignmentInfoDTO>> findAll(){
		List<AssignmentInfoDTO> assignment = assignmentService.findAll();
		return ResponseEntity.ok().body(assignment);
	}
	
	@PostMapping
	public ResponseEntity<AssignmentInfoDTO> save(@RequestBody AssignmentInfoDTO dto) {
		dto = assignmentService.save(dto);
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("{/id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<AssignmentInfoDTO> update(@PathVariable Long id, @RequestBody AssignmentInfoDTO dto) {
		dto = assignmentService.updateAssignment(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<AssignmentInfoDTO> delete(@PathVariable Long id){
		assignmentService.deleteAssignment(id);
		return ResponseEntity.noContent().build();
	}
	
}
