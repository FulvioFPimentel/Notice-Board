package com.bigcrowd.noticeBoard.dto;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Prayer;

public class PrayerDTO extends DesignationDTO {
	private static final long serialVersionUID = 1L;
	
	private String moment;
	private String person;
	
	public PrayerDTO(Prayer prayer, Person person) {
		super(prayer);
		moment = prayer.getMoment();
		this.person = person.getName();
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
}
