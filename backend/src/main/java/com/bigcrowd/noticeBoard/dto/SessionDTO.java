package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Segmentation;
import com.bigcrowd.noticeBoard.entities.Session;

public class SessionDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String session;

	private Set<SubSessionDTO> subsessions = new HashSet<>();

	public SessionDTO(Long id, String session) {
		this.id = id;
		this.session = session;
	}
	
	public SessionDTO(Session session) {
		this.id = session.getId();
		this.session = session.getSession();
		
	}
	
	public SessionDTO(Session session, Set<Segmentation> Segmentations) {
		this(session);
		Segmentations.forEach(x -> this.subsessions.add(new SubSessionDTO(x.getId().getSubsession())));
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

	public Set<SubSessionDTO> getSubsessions() {
		return subsessions;
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
		SessionDTO other = (SessionDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
