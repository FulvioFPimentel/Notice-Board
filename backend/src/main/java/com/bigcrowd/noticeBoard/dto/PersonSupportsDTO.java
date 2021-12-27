package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Support;

public class PersonSupportsDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	private List<SupportsMeetingDTO> supports = new ArrayList<>();
	
	public PersonSupportsDTO() {}

	public PersonSupportsDTO(Long id, String name, List<SupportsMeetingDTO> supports) {
		this.id = id;
		this.name = name;
		this.supports = supports;
	}
	

	public PersonSupportsDTO(Person person, Set<Support> supports) {
		id = person.getId();
		name = person.getName();
		supports.forEach(x -> this.supports.add(new SupportsMeetingDTO(x)));
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

	public List<SupportsMeetingDTO> getSupports() {
		return supports;
	}

}
