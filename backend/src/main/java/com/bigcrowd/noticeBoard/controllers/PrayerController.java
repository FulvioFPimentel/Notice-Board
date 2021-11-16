package com.bigcrowd.noticeBoard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigcrowd.noticeBoard.controllers.services.PrayerService;
import com.bigcrowd.noticeBoard.dto.PrayerDTO;

@RestController
@RequestMapping(value = "/prayers")
public class PrayerController {
	
	@Autowired
	private PrayerService prayerService;
	
	@GetMapping
	public ResponseEntity<List<PrayerDTO>> findAll(){
		List<PrayerDTO> prayers = prayerService.findAll();
		return ResponseEntity.ok().body(prayers);
	}

}
