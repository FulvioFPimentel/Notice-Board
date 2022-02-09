package com.bigcrowd.noticeBoard.dto;

import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Designation;

public class DesignationsSubSessionDTO extends ListDesignationDTO {
	
	private Instant date;
	private String session;
	private String subsession;
	
	public DesignationsSubSessionDTO(Designation designations, Instant date, String task, String session,
			String subsession) {
		super(designations);
		this.date = date;
		this.session = session;
		this.subsession = subsession;
	}

	public DesignationsSubSessionDTO(Designation designations) {
		super(designations);
		designations.getSegmentations().forEach(x -> 
		date = x.getId().getMeeting().getDate());
		designations.getSegmentations().forEach(x -> 
		session = x.getId().getSession().getSession());
		designations.getSegmentations().forEach(y -> 
		subsession = y.getId().getSubsession().getSubSession());
	}	

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getSubsession() {
		return subsession;
	}

	public void setSubsession(String subsession) {
		this.subsession = subsession;
	}

}
