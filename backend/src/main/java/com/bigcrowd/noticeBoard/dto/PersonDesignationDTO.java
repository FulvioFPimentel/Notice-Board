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
	
	private List<DesignationsMeetingDTO> designations = new ArrayList<>();
	
	public PersonDesignationDTO() {}

	public PersonDesignationDTO(Long id, String name, List<DesignationsMeetingDTO> designations) {
		this.id = id;
		this.name = name;
		this.designations = designations;
	}
	
	public PersonDesignationDTO(Person person, List<Designation> designations) {
		id = person.getId();
		name = person.getName();
		designations.forEach(x -> this.designations.add(new DesignationsMeetingDTO(x)));
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

	public List<DesignationsMeetingDTO> getDesignations() {
		return designations;
	}

	public void setDesignations(List<DesignationsMeetingDTO> designations) {
		this.designations = designations;
	}	

}
