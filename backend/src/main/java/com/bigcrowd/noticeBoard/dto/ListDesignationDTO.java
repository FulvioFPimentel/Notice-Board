package com.bigcrowd.noticeBoard.dto;

import com.bigcrowd.noticeBoard.entities.Designation;

public abstract class ListDesignationDTO {
	
	private String task;
	private String field;
	
	public ListDesignationDTO(String task, String field) {
		this.task = task;
		this.field = field;
	}
	
	public ListDesignationDTO(Designation designations) {		
		task = designations.getAssignment().getTask();
		field = designations.getAssignment().getField();
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
