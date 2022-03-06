package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Prayer;

public class PrayerSaveDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String moment;
	private DesignationSaveDTO designation;
	
	public PrayerSaveDTO() {	
	}

	public PrayerSaveDTO(Long id, String moment) {
		this.id = id;
		this.moment = moment;
	}
	
	public PrayerSaveDTO(Prayer prayer) {
		id = prayer.getId();
		moment = prayer.getMoment();
		designation = new DesignationSaveDTO(prayer.getDesignation());
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

	public DesignationSaveDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationSaveDTO designation) {
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrayerSaveDTO other = (PrayerSaveDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}


