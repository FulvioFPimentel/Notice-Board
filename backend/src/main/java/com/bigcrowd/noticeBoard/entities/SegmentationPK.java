package com.bigcrowd.noticeBoard.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class SegmentationPK implements Serializable{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "meeting_id")
	private Meeting meeting;
	
	@ManyToOne
	@JoinColumn(name = "session_id")
	private Session session;
	
	@ManyToOne
	@JoinColumn(name = "subsession_id")
	private SubSession subsession;
	
	public SegmentationPK() {
	}
	
	public SegmentationPK(Meeting meeting, Session session, SubSession subsession) {
		this.meeting = meeting;
		this.session = session;
		this.subsession = subsession;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public SubSession getSubsession() {
		return subsession;
	}

	public void setSubsession(SubSession subsession) {
		this.subsession = subsession;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meeting == null) ? 0 : meeting.hashCode());
		result = prime * result + ((session == null) ? 0 : session.hashCode());
		result = prime * result + ((subsession == null) ? 0 : subsession.hashCode());
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
		SegmentationPK other = (SegmentationPK) obj;
		if (meeting == null) {
			if (other.meeting != null)
				return false;
		} else if (!meeting.equals(other.meeting))
			return false;
		if (session == null) {
			if (other.session != null)
				return false;
		} else if (!session.equals(other.session))
			return false;
		if (subsession == null) {
			if (other.subsession != null)
				return false;
		} else if (!subsession.equals(other.subsession))
			return false;
		return true;
	}
}
