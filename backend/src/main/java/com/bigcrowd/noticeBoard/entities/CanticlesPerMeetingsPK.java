package com.bigcrowd.noticeBoard.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CanticlesPerMeetingsPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "meeting_id")
	private Meeting meeting;
	
	@ManyToOne
	@JoinColumn(name = "canticle_id")
	private Canticle canticle;

	public CanticlesPerMeetingsPK() {}
	
	public CanticlesPerMeetingsPK(Meeting meeting, Canticle canticle) {
		this.meeting = meeting;
		this.canticle = canticle;
	}
	
	public Meeting getMeeting() {
		return meeting;
	}
	
	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

	public Canticle getCanticle() {
		return canticle;
	}

	public void setCanticle(Canticle canticle) {
		this.canticle = canticle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((canticle == null) ? 0 : canticle.hashCode());
		result = prime * result + ((meeting == null) ? 0 : meeting.hashCode());
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
		CanticlesPerMeetingsPK other = (CanticlesPerMeetingsPK) obj;
		if (canticle == null) {
			if (other.canticle != null)
				return false;
		} else if (!canticle.equals(other.canticle))
			return false;
		if (meeting == null) {
			if (other.meeting != null)
				return false;
		} else if (!meeting.equals(other.meeting))
			return false;
		return true;
	}
	
}
