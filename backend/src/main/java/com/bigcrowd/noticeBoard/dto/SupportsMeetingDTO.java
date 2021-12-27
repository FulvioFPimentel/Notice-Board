package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Support;

public class SupportsMeetingDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String work;
	
	private Instant meeting;
	
	public SupportsMeetingDTO() {}

	public SupportsMeetingDTO(Long id, String work, Instant meeting) {
		this.id = id;
		this.work = work;
		this.meeting = meeting;
	}
	
	public SupportsMeetingDTO(Support support) {
		id = support.getId();
		work = support.getWork();
		meeting = support.getMeeting().getDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Instant getMeeting() {
		return meeting;
	}

	public void setMeeting(Instant meeting) {
		this.meeting = meeting;
	}

}
