package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Assignment;

public class AssignmentInfoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String task;
	private String field;
	
	public AssignmentInfoDTO() {}

	public AssignmentInfoDTO(Long id, String task, String field) {
		super();
		this.id = id;
		this.task = task;
		this.field = field;
	}
	
	public AssignmentInfoDTO(Assignment assignment) {
		id = assignment.getId();
		task = assignment.getTask();
		field = assignment.getField();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
