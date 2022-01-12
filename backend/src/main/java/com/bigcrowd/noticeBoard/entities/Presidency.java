package com.bigcrowd.noticeBoard.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_presidency")
public class Presidency extends Designation {
	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "meeting_id", referencedColumnName = "id")
	private Meeting meeting;
		
	public Presidency() {}

	public Presidency(Long id, String designation, Meeting meeting) {
		super(id, designation);
		this.meeting = meeting;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

}
