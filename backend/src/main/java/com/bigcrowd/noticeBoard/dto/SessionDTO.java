package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Session;
import com.bigcrowd.noticeBoard.entities.SubSession;

public class SessionDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String session;

	private Set<SubSessionDTO> subsessions = new HashSet<>();

	public SessionDTO(String session) {
		this.session = session;
	}
	
	public SessionDTO(Session session) {
		this.session = session.getSession();
	}
	
	public SessionDTO(Session session, Set<SubSession> subsessions) {
		this(session);
		subsessions.forEach(x -> this.subsessions.add(new SubSessionDTO(x, x.getDesignations())));
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public Set<SubSessionDTO> getSubsessions() {
		return subsessions;
	}
	
}
