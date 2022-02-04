package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Person;

public class PersonSaveDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	private String cellPhone;
	
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
	
}
