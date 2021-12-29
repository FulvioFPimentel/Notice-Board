package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Designation;

public class DesignationsMeetingDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant date;
	private String session;
	private String subSession;
	
	private String designation;
	
	public DesignationsMeetingDTO(Long id, String designation, Instant date, String session, String subSession) {
		this.id = id;
		this.designation = designation;
		this.date = date;
		this.session = session;
		this.subSession = subSession;
	}
	
	public DesignationsMeetingDTO(Designation designation) {
		id = designation.getId();
		this.designation = designation.getDesignation();
		date = designation.getSubsession().getSession().getMeetings().getDate();
		session = designation.getSubsession().getSession().getSession();
		subSession = designation.getSubsession().getSubSession();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public String getSubSession() {
		return subSession;
	}

	public void setSubSession(String subSession) {
		this.subSession = subSession;
	}

}
