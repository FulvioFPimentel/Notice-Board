package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Session;
import com.bigcrowd.noticeBoard.entities.SubSession;

public class SessionDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String session;
	
	private List<SubSessionDTO> subSession = new ArrayList<>();
	
	public SessionDTO() {
	}
	
	public SessionDTO(Long id, String session) {
		this.id = id;
		this.session = session;
	}
	
	public SessionDTO(Session sessions, List<SubSession> subSession) {
		this.id = sessions.getId();
		this.session = sessions.getSession();
		subSession.forEach(x -> this.subSession.add(new SubSessionDTO(x, x.getDesignations())));		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public List<SubSessionDTO> getSubSession() {
		return subSession;
	}
	
}
