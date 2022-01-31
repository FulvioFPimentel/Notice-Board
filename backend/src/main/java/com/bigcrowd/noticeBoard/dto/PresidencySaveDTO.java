package com.bigcrowd.noticeBoard.dto;

import com.bigcrowd.noticeBoard.entities.Presidency;

public class PresidencySaveDTO {
	

	private Long id;
	private DesignationDTO designation;
	private MeetingDTO meeting;

	public PresidencySaveDTO(Long id, DesignationDTO designation, MeetingDTO meeting) {
		super();
		this.id = id;
		this.designation = designation;
		this.meeting = meeting;
	}
	
	public PresidencySaveDTO(Presidency presidency) {
		id = presidency.getId();
		designation = new DesignationDTO(presidency.getDesignation());
		meeting = new MeetingDTO(presidency.getMeeting());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DesignationDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}

	public MeetingDTO getMeeting() {
		return meeting;
	}

	public void setMeeting(MeetingDTO meeting) {
		this.meeting = meeting;
	}

}
