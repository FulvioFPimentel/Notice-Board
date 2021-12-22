package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Person;
import com.bigcrowd.noticeBoard.entities.Prayer;

public class PrayerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String moment;
	
	private String person;
	
	public PrayerDTO() {
	}

	public PrayerDTO(Long id, String moment, Person person) {
		this.id = id;
		this.moment = moment;
	}
	
	public PrayerDTO(Prayer prayers, Person person) {
		this.id = prayers.getId();
		this.moment = prayers.getMoment();
		this.person = person.getName();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
