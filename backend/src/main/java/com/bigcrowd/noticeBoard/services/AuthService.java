package com.bigcrowd.noticeBoard.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedClientException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;
import com.bigcrowd.noticeBoard.services.exceptions.ForbiddenException;

@Service
public class AuthService {
	
	@Autowired
	private PersonRepository personRepository;
	
	
	@Transactional(readOnly = true)
	public Person authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return personRepository.findByName(username);
		}catch (Exception e) {
			throw new UnauthorizedClientException("Invalid user");
		}
	}
	
	public void validateSelfOrAdmin(Long userId) {
		Person person = authenticated();
		if(!person.getId().equals(userId) && !person.hasRole("ROLE_ADMIN")) {
			throw new ForbiddenException("Access denied");
		}
	}

}
