package com.bigcrowd.noticeBoard.services;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedClientException;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.repositories.PersonRepository;

public class AuthService {
	
	private PersonRepository personRepository;
	
	public Person authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return personRepository.findByName(username);
		}catch (Exception e) {
			throw new UnauthorizedClientException("Invalid user");
		}
	}

}
