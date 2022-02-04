package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Presidency;

public class PresidencySaveDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private DesignationSaveDTO designation;
	private MeetingSaveDTO meeting;
	
	public PresidencySaveDTO() {}

	public PresidencySaveDTO(Long id) {
		this.id = id;
	}
	
	public PresidencySaveDTO(Presidency presidency) {
		id = presidency.getId();
		designation = new DesignationSaveDTO(presidency.getDesignation());
		meeting = new MeetingSaveDTO(presidency.getMeeting(), presidency);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DesignationSaveDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationSaveDTO designation) {
		this.designation = designation;
	}

	public MeetingSaveDTO getMeeting() {
		return meeting;
	}

	public void setMeeting(MeetingSaveDTO meeting) {
		this.meeting = meeting;
	}

}
