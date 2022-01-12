package com.bigcrowd.noticeBoard.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_prayer")
public class Prayer extends Designation {
	private static final long serialVersionUID = 1L;
	
	private String moment;
				
	@ManyToMany(mappedBy = "prayers")
	private Set<Meeting> meetings = new HashSet<>();
	
	public Prayer() {	
	}

	public Prayer(Long id, String designation, String moment) {
		super(id, designation);
		this.moment = moment;
	}
	
	public String getMoment() {
		return moment;
	}

	public void setMoment(String moment) {
		this.moment = moment;
	}

	public Set<Meeting> getMeetings() {
		return meetings;
	}
	
}
