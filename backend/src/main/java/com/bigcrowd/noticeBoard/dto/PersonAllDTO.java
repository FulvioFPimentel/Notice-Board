package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Role;

public class PersonAllDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String name;
	private String cellPhone;
	private Set<RoleDTO> roles = new HashSet<>();
	
	public PersonAllDTO(Long id, String name, String cellPhone) {
		this.id = id;
		this.name = name;
		this.cellPhone = cellPhone;
	}

	public PersonAllDTO(Person person, Set<Role> roles) {
		id = person.getId();
		name = person.getName();
		cellPhone = person.getCellPhone();
		roles.forEach(x ->  this.roles.add(new RoleDTO(x)));
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

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
}
