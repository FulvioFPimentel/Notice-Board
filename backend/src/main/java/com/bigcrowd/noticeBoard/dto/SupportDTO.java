package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Support;

public class SupportDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String work;
	
	private Set<PersonDTO> persons = new HashSet<>();
	
	public SupportDTO() {
	}

	public SupportDTO(Long id, String work, Set<PersonDTO> persons) {
		this.id = id;
		this.work = work;
		this.persons = persons;
	}
	
	public SupportDTO(Support support) {
		id = support.getId();
		work = support.getWork();
	}

	public SupportDTO(Support support , Set<Person> persons) {
		id = support.getId();
		work = support.getWork();
		persons.forEach(x -> this.persons.add(new PersonDTO(x)));
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Set<PersonDTO> getPersons() {
		return persons;
	}

}
