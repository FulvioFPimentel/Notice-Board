package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Person;

public class PersonDesignationsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String person;	
	
	public PersonDesignationsDTO(String person, String task, String subsession) {
		this.person = person;
	}
	
	public PersonDesignationsDTO(Person person, List<Designation> designations) {
		this.person = person.getName();
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
}
