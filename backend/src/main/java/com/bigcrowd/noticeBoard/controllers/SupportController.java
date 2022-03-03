package com.bigcrowd.noticeBoard.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bigcrowd.noticeBoard.dto.SupportDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.SupportSaveDTO;
import com.bigcrowd.noticeBoard.services.SupportService;
import com.bigcrowd.noticeBoard.services.exceptions.ControllerNotFoundException;

@RestController
@RequestMapping(value = "/supports")
public class SupportController {
	
	@Autowired
	private SupportService supportService;
	
	@GetMapping
	public ResponseEntity<List<SupportDTO>> findAll(){
		List<SupportDTO> supports = supportService.findAllSupports();
		return ResponseEntity.ok().body(supports);
	}
	
	@PostMapping
	public ResponseEntity<SupportDTO> save(@RequestBody SupportSaveDTO dto) {
		try {
			SupportDTO entity = supportService.saveSupport(dto);
			URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(entity.getId()).toUri();
			return ResponseEntity.created(uri).body(entity);
			
		} catch (RuntimeException e) {
			throw new ControllerNotFoundException("Not Found");
		}
	}
	
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<SupportSaveDTO> update(@PathVariable Long id, @RequestBody SupportSaveDTO dto){
		
		try {
			dto = supportService.update(id, dto);
			return ResponseEntity.ok().body(dto);
		} catch(RuntimeException e) {
			throw new ControllerNotFoundException("Not Found");
		}
	}
}
