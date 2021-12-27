package com.bigcrowd.noticeBoard.dto;

import java.util.ArrayList;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Person;

public class DesignationDTO {
	
	private Long id;
	private String designation;
		
	private List<PersonDTO> persons = new ArrayList<>();

	public DesignationDTO(Long id, String designation, List<PersonDTO> persons) {
		this.id = id;
		this.designation = designation;
		this.persons = persons;
	}
	
	public DesignationDTO(Designation designation) {
		this.id = designation.getId();
		this.designation = designation.getDesignation();
	}
	
	public DesignationDTO(Designation designation, List<Person> persons) {
		this.id = designation.getId();
		this.designation = designation.getDesignation();
		persons.forEach(x -> this.persons.add(new PersonDTO(x)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<PersonDTO> getPersons() {
		return persons;
	}

}
