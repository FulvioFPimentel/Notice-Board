package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Segmentation;
import com.bigcrowd.noticeBoard.entities.SubSession;

public class SubSessionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String subsession;
	private int moment;
	private int time;
	
	private Set<DesignationDTO> designations = new HashSet<>();
	
	public SubSessionDTO() {}
	
	public SubSessionDTO(SubSession subsession) {
		id = subsession.getId();
		this.subsession = subsession.getSubSession();
	}
	
	public SubSessionDTO(SubSession subsession, Set<Designation> designations, Segmentation seg) {
		this(subsession);
		this.moment = seg.getMoment();
		this.time = seg.getTime();
		designations.forEach(x -> this.designations.add(new DesignationDTO(x)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubsession() {
		return subsession;
	}

	public void setSubSession(String subSession) {
		this.subsession = subSession;
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

	public Set<DesignationDTO> getDesignations() {
		return designations;
	}

}
