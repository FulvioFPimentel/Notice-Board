package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.SubSession;

public class SubSessionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String subSession;
	
	private List<DesignationDTO> designations = new ArrayList<>(); 

	public SubSessionDTO() {
	}
	
	public SubSessionDTO(Long id, String subSession) {
		this.id = id;
		this.subSession = subSession;
	}
	
	public SubSessionDTO(SubSession subSessions, List<Designation> designations) {
		this.id = subSessions.getId();
		this.subSession = subSessions.getSubSession();
		designations.forEach(x -> this.designations.add(new DesignationDTO(x, x.getPersons())));
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

	public List<DesignationDTO> getDesignations() {
		return designations;
	}
	
}
