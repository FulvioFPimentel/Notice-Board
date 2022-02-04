package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Presidency;

public class PresidencyDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private DesignationDTO designation;

	public PresidencyDTO() {}
	
	public PresidencyDTO(Long id, DesignationDTO designation) {
		super();
		this.id = id;
		this.designation = designation;
	}

	public PresidencyDTO(Presidency presidency) {
		id = presidency.getId();
		designation = new DesignationDTO(presidency.getDesignation());
	}
	
		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DesignationDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}
	
}
