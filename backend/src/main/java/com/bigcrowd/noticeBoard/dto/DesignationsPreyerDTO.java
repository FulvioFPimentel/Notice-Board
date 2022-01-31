package com.bigcrowd.noticeBoard.dto;

import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Designation;

public class DesignationsPreyerDTO extends ListDesignationDTO {
	
	private Instant date;
	private String moment;
	
	public DesignationsPreyerDTO(Designation designations) {
		super(designations);
		date = designations.getPrayer().getMeeting().getDate();
		moment = designations.getPrayer().getMoment();
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

}
