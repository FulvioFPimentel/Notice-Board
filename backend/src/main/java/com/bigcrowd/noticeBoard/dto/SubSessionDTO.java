package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.SubSession;

public class SubSessionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String subsession;
	private Set<DesignationDTO> designations = new HashSet<>();
	
	public SubSessionDTO() {}
	
	public SubSessionDTO(SubSession subsession) {
		this.subsession = subsession.getSubSession();
	}
	
	public SubSessionDTO(SubSession subsession, Set<Designation> designations) {
		this(subsession);
		designations.forEach(x -> this.designations.add(new DesignationDTO(x)));
	}

	public String getSubSession() {
		return subsession;
	}

	public void setSubSession(String subSession) {
		this.subsession = subSession;
	}

	public Set<DesignationDTO> getDesignations() {
		return designations;
	}

}
