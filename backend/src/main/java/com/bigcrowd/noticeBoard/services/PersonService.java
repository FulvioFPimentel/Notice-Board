package com.bigcrowd.noticeBoard.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.PersonDesignationDTO;
import com.bigcrowd.noticeBoard.dto.PersonSupportsDTO;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;

import javassist.NotFoundException;


@Service
public class PersonService implements UserDetailsService {
	
	private static Logger logger = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Person person = personRepository.findByName(username);
		if(person == null) {
			logger.error(" not found: " + username);	
			throw new UsernameNotFoundException("Name not found");
		}
		logger.info("Person found: " + username);
		return person;
	}
	
	@Transactional(readOnly = true)
	public PersonSupportsDTO findSupportById(Long id) throws NotFoundException {
		Optional<Person> obj = personRepository.findSupportById(id);
		Person persons = obj.orElseThrow(() -> new NotFoundException("Entity not found"));
		return new PersonSupportsDTO(persons, persons.getSupports());
	}
	
	public PersonDesignationDTO findDesignationById(Long id) throws NotFoundException {
		Optional<Person> obj = personRepository.findDesignationById(id);
		Person persons = obj.orElseThrow(() -> new NotFoundException("Entity not found"));
		return new PersonDesignationDTO(persons, persons.getDesignations());
	}
		
}
