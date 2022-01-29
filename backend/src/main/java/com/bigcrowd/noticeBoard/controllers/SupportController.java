package com.bigcrowd.noticeBoard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigcrowd.noticeBoard.dto.SupportDTO;
import com.bigcrowd.noticeBoard.services.SupportService;

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
	

}
