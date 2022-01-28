package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Person;

public class PersonDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	public PersonDTO(String name) {
		this.name = name;
	}
	
	public PersonDTO(Person person) {
		name = person.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
