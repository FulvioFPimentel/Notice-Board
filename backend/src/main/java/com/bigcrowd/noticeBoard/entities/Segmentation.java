package com.bigcrowd.noticeBoard.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_segmentation")
public class Segmentation {
	
	@EmbeddedId
	private SegmentationPK id = new SegmentationPK();
	
	private int time;
	private int moment;
	
	@ManyToMany(mappedBy = "segmentations")
	private Set<Designation> designations = new LinkedHashSet<>();
	
	public Segmentation() {}

	public Segmentation(Meeting meeting, Session session, SubSession subsession, int time, int moment, Set<Designation> designations) {
		id.setMeeting(meeting);
		id.setSession(session);
		id.setSubsession(subsession);
		this.time = time;
		this.moment = moment;
		this.designations = designations;
	}
	
	public Meeting getMeeting() {
		return id.getMeeting();
	}
	
	public Session getSession() {
		return id.getSession();
	}
	
	public SubSession getSubSession() {
		return id.getSubsession();
	}
	
	public void setMeeting(Meeting meeting) {
		id.setMeeting(meeting);
	}
	
	public void setSession(Session session) {
		id.setSession(session);
	}
	
	public void setSubSession(SubSession subsession) {
		id.setSubsession(subsession);
	}
	
	public SegmentationPK getId() {
		return id;
	}
	
	public void setId(SegmentationPK id) {
		this.id = id;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getMoment() {
		return moment;
	}

	public void setMoment(int moment) {
		this.moment = moment;
	}

	public Set<Designation> getDesignations() {
		return designations;
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
		Segmentation other = (Segmentation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
