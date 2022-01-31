package com.bigcrowd.noticeBoard.dto;

import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Designation;

public class DesignationsSupportDTO extends ListDesignationDTO {
	
	private Instant date;
	
	public DesignationsSupportDTO(Designation designations) {
		super(designations);
		designations.getSupports().forEach(x -> date = x.getMeeting().getDate());
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}
}
