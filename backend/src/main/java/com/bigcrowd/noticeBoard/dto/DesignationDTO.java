package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Designation;

public abstract class DesignationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String designation;
		
	public DesignationDTO(Long id, String list) {
		this.id = id;
		this.designation = list;
	}
	
	public DesignationDTO(Designation designation) {
		this.id = designation.getId();
		this.designation = designation.getDesignation();
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

}
