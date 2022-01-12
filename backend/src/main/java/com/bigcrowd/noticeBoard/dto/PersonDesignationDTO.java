package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Person;

public class PersonDesignationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	private List<DesignationsMeetingDTO> designation = new ArrayList<>();

	public PersonDesignationDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public PersonDesignationDTO(Person person, List<Designation> designation) {
		id = person.getId();
		name = person.getName();
		designation.forEach(x -> this.designation.add(new DesignationsMeetingDTO(x)));
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DesignationsMeetingDTO> getDesignation() {
		return designation;
	}

}
