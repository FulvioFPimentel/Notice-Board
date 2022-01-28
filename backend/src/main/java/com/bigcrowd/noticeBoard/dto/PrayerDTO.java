package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Prayer;

public class PrayerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String moment;
	private DesignationDTO designation;
	
	public PrayerDTO(String moment) {
		this.moment = moment;
	}
	
	public PrayerDTO(Prayer prayer) {
		moment = prayer.getMoment();
		designation = new DesignationDTO(prayer.getDesignation());
	}

	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

	public DesignationDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}
}
