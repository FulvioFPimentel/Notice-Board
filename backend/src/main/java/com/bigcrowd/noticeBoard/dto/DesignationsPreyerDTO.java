package com.bigcrowd.noticeBoard.dto;

import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Designation;

public class DesignationsPreyerDTO extends ListDesignationDTO {
	
	private Instant date;
	private int moment;
	
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

	public int getMoment() {
		return moment;
	}

	public void setMoment(int moment) {
		this.moment = moment;
	}

}
