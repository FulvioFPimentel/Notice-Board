package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Assignment;

public class AssignmentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String task;
	
	public AssignmentDTO() {
	}

	public AssignmentDTO(Long id, String task, String field) {
		this.task = task;

	}
	
	public AssignmentDTO (Assignment assignment) {
		task = assignment.getTask();
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
}
