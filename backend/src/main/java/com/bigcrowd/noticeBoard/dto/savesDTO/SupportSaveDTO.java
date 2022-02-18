package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Support;

public class SupportSaveDTO {

	private Long id;
	private Long meetingId;
	
	private Set<DesignationSaveDTO> designations = new HashSet<>();

	public SupportSaveDTO() {
	}
	
	public SupportSaveDTO(Support support, Set<Designation> designations) {
		id = support.getId(); 
		meetingId = support.getMeeting().getId();
		designations.forEach(x -> this.designations.add(new DesignationSaveDTO(x.getId(), x.getAssignment(), x.getPerson())));
	}
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	public Set<DesignationSaveDTO> getDesignations() {
		return designations;
	}	
}
