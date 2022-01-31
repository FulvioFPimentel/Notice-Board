package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Presidency;

public class PresidencyDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private DesignationDTO designation;

	public PresidencyDTO(Presidency presidency) {
		designation = new DesignationDTO(presidency.getDesignation());
	}

	public DesignationDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}
	
}
