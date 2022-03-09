package com.bigcrowd.noticeBoard.services;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.PersonAllDTO;
import com.bigcrowd.noticeBoard.dto.PersonDesignationsDTO;
import com.bigcrowd.noticeBoard.dto.RoleDTO;
import com.bigcrowd.noticeBoard.dto.savesDTO.PersonSaveDTO;
import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Role;
import com.bigcrowd.noticeBoard.repositories.DesignationRepository;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;
import com.bigcrowd.noticeBoard.repositories.RoleRepository;

@Service
public class PersonService implements UserDetailsService, Serializable {
	private static final long serialVersionUID = 1L;

	private static Logger logger = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private DesignationRepository designationRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
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
	
	@Transactional(readOnly = true)
	public PersonDesignationsDTO findById(Long id) {
		Optional<Person> obj = personRepository.findById(id);
		Person person = obj.get();
		List<Designation> designations = designationRepository.findAllByPerson(person);
		return new PersonDesignationsDTO(person, designations);
	}
	
	@Transactional
	public PersonAllDTO savePerson(PersonSaveDTO dto) {
		Person person = new Person ();
		
		person.setName(dto.getName());
		person.setCellPhone(dto.getCellPhone());
		person.setPassword(passwordEncoder.encode(dto.getPassword()));
		
		Role role = roleRepository.getById(3L);
				
		person.getRoles().add(role);
		person = personRepository.saveAndFlush(person);	
		
		return new PersonAllDTO(person, person.getRoles());
	}
	
	public PersonSaveDTO updatePerson(Long id, PersonSaveDTO dto) {
		Person person = personRepository.getById(id);
		
		person.setName(dto.getName());
		person.setCellPhone(dto.getCellPhone());
		person.setPassword(passwordEncoder.encode(dto.getPassword()));
		
		person = personRepository.saveAndFlush(person);
		
		return new PersonSaveDTO(person);
	}
	
	public PersonSaveDTO updatePersonRole(Long id, PersonSaveDTO dto) {
		authService.validateSelfOrAdmin(id);
		Person person = personRepository.getById(id);
		
		person.setName(dto.getName());
		person.setCellPhone(dto.getCellPhone());
		person.setPassword(passwordEncoder.encode(dto.getPassword()));
		
		person.getRoles().clear();
		for(RoleDTO roles: dto.getRoles()) {
			Role role = roleRepository.getById(roles.getId());			
			role = roleRepository.saveAndFlush(role);
			person.getRoles().add(role);
		}
		
		person = personRepository.saveAndFlush(person);
		return new PersonSaveDTO(person);
	}	
}
