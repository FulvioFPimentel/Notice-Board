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

import com.bigcrowd.noticeBoard.dto.PersonAllDTO;
import com.bigcrowd.noticeBoard.dto.PersonDesignationsDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.PersonSaveDTO;
import com.bigcrowd.noticeBoard.services.PersonService;

@RestController
@RequestMapping(value = "/persons")
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

	@PostMapping(value = "/create")
	public ResponseEntity<PersonAllDTO> savePerson(@RequestBody PersonSaveDTO dto) {
		PersonAllDTO entity = personService.savePerson(dto);
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(entity.getId()).toUri();
		return ResponseEntity.created(uri).body(entity);
	}
	
	@PutMapping(value = "/user/{id}")
	public ResponseEntity<PersonSaveDTO> update(@PathVariable Long id, @RequestBody PersonSaveDTO dto) {
		dto = personService.updatePerson(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@PutMapping(value = "/admin/{id}")
	public ResponseEntity<PersonSaveDTO> updateRole(@PathVariable Long id, @RequestBody PersonSaveDTO dto) {
		dto = personService.updatePersonRole(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<PersonSaveDTO> delete(@PathVariable Long id) {
		personService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
