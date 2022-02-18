package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.util.HashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Meeting;

public class SupportSaveDTO {

	private Long meetingId;
	
	private Set<DesignationSaveDTO> designations = new HashSet<>();

	public SupportSaveDTO() {
	}
	
	public SupportSaveDTO(Meeting meetingId, Set<Designation> designations) {
		this.meetingId = meetingId.getId();
		designations.forEach(x -> this.designations.add(new DesignationSaveDTO(x.getId(), x.getAssignment(), x.getPerson())));
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
