package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Meeting;

public class MeetingDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant date;
	private String presidency;
	
	public MeetingDTO() {
	}

	public MeetingDTO(Long id, Instant date, String presidency) {
		this.id = id;
		this.date = date;
		this.presidency = presidency;
	}
	
	public MeetingDTO(Meeting meeting) {
		id = meeting.getId();
		date = meeting.getDate();
		presidency = meeting.getPresidency().getName();
		
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

	public String getPresidency() {
		return presidency;
	}

	public void setPresidency(String presidency) {
		this.presidency = presidency;
	}
	
}
