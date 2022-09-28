package com.bigcrowd.noticeBoard.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_canticlesPerMeetings")
public class CanticlesPerMeetings implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CanticlesPerMeetingsPK id = new CanticlesPerMeetingsPK();
	
	private String moment;
	
	public CanticlesPerMeetings() {}
	
	public CanticlesPerMeetings(Meeting meeting, Canticle canticle, String moment) {
		id.setMeeting(meeting);
		id.setCanticle(canticle);
		this.moment = moment;
	}

	public CanticlesPerMeetingsPK getId() {
		return id;
	}

	public void setId(CanticlesPerMeetingsPK id) {
		this.id = id;
	}

	public String getMoment() {
		return moment;
	}

	public void setMeeting(Meeting meeting) {
		id.setMeeting(meeting);
	}

	public Meeting getMeeting() {
		return id.getMeeting();
	}

	public void setCanticle(Canticle canticle) {
		id.setCanticle(canticle);
	}

	public Canticle getCanticle() {
		return id.getCanticle();
	}

	public void setMoment(String moment) {
		this.moment = moment;
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
		CanticlesPerMeetings other = (CanticlesPerMeetings) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	

}
