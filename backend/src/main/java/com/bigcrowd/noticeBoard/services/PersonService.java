package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bigcrowd.noticeBoard.dto.PersonAllDTO;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;


@Service
public class PersonService implements UserDetailsService {
	
	private static Logger logger = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private PersonRepository personRepository;
	
	//private DesignationRepository designationRepository;
	
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
	
	public List<PersonAllDTO> findAllPersons(){
		List<Person> persons = personRepository.findAll();
		return persons.stream().map(x -> new PersonAllDTO(x, x.getRoles())).collect(Collectors.toList());
	}
	
	public PersonAllDTO findById(Long id) {
		Optional<Person> obj = personRepository.findById(id);
		Person person = obj.get();
		//List<Designation> designations = designationRepository.findAllById(id);
		return new PersonAllDTO(person, person.getRoles());
	}
	
}
