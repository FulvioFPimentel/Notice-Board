package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Prayer;

public class PrayerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int moment;
	private DesignationDTO designation;
	
	public PrayerDTO(int moment) {
		this.moment = moment;
	}
	
	public PrayerDTO(Prayer prayer) {
		id = prayer.getId();
		moment = prayer.getMoment();
		designation = new DesignationDTO(prayer.getDesignation());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMoment() {
		return moment;
	}

	public void setMoment(int moment) {
		this.moment = moment;
	}

	public DesignationDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}
}
