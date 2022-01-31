package com.bigcrowd.noticeBoard.dto;

import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Designation;

public class DesignationsPresidencyDTO extends ListDesignationDTO {

	private Instant date;
	
	public DesignationsPresidencyDTO(Designation designations) {
		super(designations);
		date = designations.getPresidency().getMeeting().getDate();
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}
	
}
