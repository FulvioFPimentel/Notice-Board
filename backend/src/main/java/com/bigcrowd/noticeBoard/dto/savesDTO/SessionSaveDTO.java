package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class SessionSaveDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String session;

	private Set<MeetingSaveDTO> meetings = new LinkedHashSet<>();
	private Set<SubSessionSaveDTO> subsessions = new LinkedHashSet<>();
	
	public SessionSaveDTO() {
	}

	public SessionSaveDTO(Long id, String session) {
		this.id = id;
		this.session = session;
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
	
	public Set<MeetingSaveDTO> getMeetings() {
		return meetings;
	}

	public Set<SubSessionSaveDTO> getSubsessions() {
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
		SessionSaveDTO other = (SessionSaveDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
 


