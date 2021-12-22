package com.bigcrowd.noticeBoard.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Canticle;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Prayer;
import com.bigcrowd.noticeBoard.entities.Session;

public class MeetingAllDataDTO {
	
	
	private Long id;
	private Instant date;
	private String presidency;
	
	private List<CanticleDTO> canticles = new ArrayList<>();
	private List<PrayerDTO> prayers = new ArrayList<>();
	private List<SessionDTO> sessions = new ArrayList<>();
	
	public MeetingAllDataDTO() {
	}

	public MeetingAllDataDTO(Long id, Instant date, String presidency, List<Canticle> canticles, List<Prayer> prayers) {
		this.id = id;
		this.date = date;
		this.presidency = presidency;
	}
	
	public MeetingAllDataDTO(Meeting meeting) {
		this.id = meeting.getId();
		this.date = meeting.getDate();
		this.presidency = meeting.getPresidency();
	}
	
	public MeetingAllDataDTO(Meeting meeting, List<Canticle> canticles, List<Prayer> prayers, List<Session> sessions) {
		this(meeting);		
		canticles.forEach(x -> 	this.canticles.add(new CanticleDTO(x)));
		prayers.forEach(x -> this.prayers.add(new PrayerDTO(x, x.getPerson())));
		sessions.forEach(x -> this.sessions.add(new SessionDTO(x, x.getSubSessions())));
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

	public List<CanticleDTO> getCanticles() {
		return canticles;
	}

	public void setCanticles(List<CanticleDTO> canticles) {
		this.canticles = canticles;
	}

	public List<PrayerDTO> getPrayers() {
		return prayers;
	}

	public void setPrayers(List<PrayerDTO> prayers) {
		this.prayers = prayers;
	}

	public List<SessionDTO> getSessions() {
		return sessions;
	}

	public void setSessions(List<SessionDTO> sessions) {
		this.sessions = sessions;
	}
	
	
	
}
