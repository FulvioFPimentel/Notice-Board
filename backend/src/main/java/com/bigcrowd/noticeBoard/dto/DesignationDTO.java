package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Designation;

public class DesignationDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String assignment;
	private String person;
	
	public DesignationDTO(Designation designation) {
		assignment = designation.getAssignment().getTask();
		person = designation.getPerson().getName();
	}
	
	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
}
