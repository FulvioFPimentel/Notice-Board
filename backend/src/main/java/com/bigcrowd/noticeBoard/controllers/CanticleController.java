package com.bigcrowd.noticeBoard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigcrowd.noticeBoard.dto.CanticleDTO;
import com.bigcrowd.noticeBoard.services.CanticleService;

@RestController
@RequestMapping(value = "/canticles")
public class CanticleController {
	
	@Autowired
	private CanticleService canticleService;
	
	@GetMapping
	public ResponseEntity<List<CanticleDTO>> findAll() {
		List<CanticleDTO> canticles = canticleService.findAll();
		return ResponseEntity.ok().body(canticles);	
	}

}
