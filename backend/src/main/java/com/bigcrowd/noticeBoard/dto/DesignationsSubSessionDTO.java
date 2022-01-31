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
		designations.getSubsessions().forEach(x ->
			x.getMeetings().forEach(y -> date = y.getDate()));
		designations.getSubsessions().forEach(x -> 
			x.getSessions().forEach(y -> session = y.getSession()));
		designations.getSubsessions().forEach(y -> subsession = y.getSubSession());
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
