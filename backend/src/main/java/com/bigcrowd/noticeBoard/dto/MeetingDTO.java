package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Meeting;

public class MeetingDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant date;
	
	public MeetingDTO() {
	}

	public MeetingDTO(Long id, Instant date) {
		this.id = id;
		this.date = date;
	}
	
	public MeetingDTO(Meeting meeting) {
		id = meeting.getId();
		date = meeting.getDate();
		
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
	
}
