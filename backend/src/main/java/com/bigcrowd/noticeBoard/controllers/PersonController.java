package com.bigcrowd.noticeBoard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigcrowd.noticeBoard.dto.PersonDesignationDTO;
import com.bigcrowd.noticeBoard.dto.PersonSupportsDTO;
import com.bigcrowd.noticeBoard.services.PersonService;

import javassist.NotFoundException;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/{id}/supports")
	public ResponseEntity<PersonSupportsDTO> findSupportById(@PathVariable Long id) throws NotFoundException{
		PersonSupportsDTO persons = personService.findSupportById(id);
		return ResponseEntity.ok().body(persons);
	}
		
	@GetMapping(value = "/{id}/designations")
	public ResponseEntity<PersonDesignationDTO> findDesignationById(@PathVariable Long id) throws NotFoundException {
		PersonDesignationDTO persons = personService.findDesignationById(id);
		return ResponseEntity.ok().body(persons);
	}


}
