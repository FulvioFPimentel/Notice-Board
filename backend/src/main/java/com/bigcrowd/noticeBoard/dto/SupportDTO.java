package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Support;

public class SupportDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant date;
	
	private Set<DesignationDTO> designations = new HashSet<>();
	
	public SupportDTO(Support support, Set<Designation> designation) {
		id = support.getId();
		date = support.getMeeting().getDate();
		designation.forEach(x -> this.designations.add(new DesignationDTO(x)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Set<DesignationDTO> getDesignations() {
		return designations;
	}

}
