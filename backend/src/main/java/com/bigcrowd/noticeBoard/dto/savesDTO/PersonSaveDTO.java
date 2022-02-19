package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.dto.RoleDTO;
import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Role;

public class PersonSaveDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	private String cellPhone;
	private String password;
	
	private Set<RoleDTO> roles = new HashSet<>();
	
	public PersonSaveDTO() {
	}
	
	public PersonSaveDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public PersonSaveDTO(Long id, String name, String cellPhone) {
		this.id = id;
		this.name = name;
		this.cellPhone = cellPhone;
	}
	
	public PersonSaveDTO(Person person) {
		id = person.getId();
		name = person.getName();
		cellPhone = person.getCellPhone();
	}

	
	public PersonSaveDTO(Person person, Set<Role> roles) {
		id = person.getId();
		name = person.getName();
		cellPhone = person.getCellPhone();
		password = person.getPassword();
		roles.forEach(x -> this.roles.add(new RoleDTO(x)));
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}
	
}
