package com.bigcrowd.noticeBoard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigcrowd.noticeBoard.dto.PersonAllDTO;
import com.bigcrowd.noticeBoard.dto.PersonDesignationsDTO;
import com.bigcrowd.noticeBoard.services.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping
	public ResponseEntity<List<PersonAllDTO>> findAll(){
		List<PersonAllDTO> persons = personService.findAllPersons();
		return ResponseEntity.ok().body(persons);
	}
	
	@GetMapping(value = "/{id}/designations")
	public ResponseEntity<PersonDesignationsDTO> findById(@PathVariable Long id){
		PersonDesignationsDTO person = personService.findById(id);
		return ResponseEntity.ok().body(person);
	}

}
