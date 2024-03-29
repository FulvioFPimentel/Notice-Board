package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.SubSession;

public class SubSessionSaveDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String subSession;
	private int moment;
	private int time;
		
	private Set<SessionSaveDTO> sessions = new LinkedHashSet<>();
	private Set<MeetingSaveDTO> meetings  = new LinkedHashSet<>();
	
	private Set<SegmantationSaveDTO> segmantations = new LinkedHashSet<>();
	private Set<DesignationSaveDTO> designations = new LinkedHashSet<>();
		
	public SubSessionSaveDTO() {
	}

	public SubSessionSaveDTO(Long id, String subSession) {
		super();
		this.id = id;
		this.subSession = subSession;
	}
	
	public SubSessionSaveDTO(SubSession subsession) {
		id = subsession.getId();
		subSession = subsession.getSubSession();
	}
	
	public SubSessionSaveDTO(SubSession subsession, int moment, int time, Set<Designation> designations) {
		id = subsession.getId();
		subSession = subsession.getSubSession();
		this.moment = moment;
		this.time = time;		
		designations.forEach(x -> this.designations.add(new DesignationSaveDTO(x.getId(),x.getAssignment(), x.getPerson() )));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubSession() {
		return subSession;
	}

	public void setSubSession(String subSession) {
		this.subSession = subSession;
	}

	public int getMoment() {
		return moment;
	}

	public void setMoment(int moment) {
		this.moment = moment;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Set<SessionSaveDTO> getSessions() {
		return sessions;
	}

	public Set<MeetingSaveDTO> getMeetings() {
		return meetings;
	}

	public Set<DesignationSaveDTO> getDesignations() {
		return designations;
	}

	public Set<SegmantationSaveDTO> getSegmantations() {
		return segmantations;
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
		SubSessionSaveDTO other = (SubSessionSaveDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
