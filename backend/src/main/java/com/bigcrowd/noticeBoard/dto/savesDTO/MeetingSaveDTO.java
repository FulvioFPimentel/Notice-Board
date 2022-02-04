package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;
import java.time.Instant;

import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Presidency;

public class MeetingSaveDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant date;
	private PresidencySaveDTO presidency;
	
	//private List<Canticle> canticles = new ArrayList<>();
	//private List<Prayer> prayers = new ArrayList<>();
	//private Set<Session> sessions = new HashSet<>();
	//private Set<SubSession> subsessions = new HashSet<>();
		
	public MeetingSaveDTO() {
	}

	public MeetingSaveDTO(Long id, Instant date) {
		this.id = id;
		this.date = date;
	}
	
	public MeetingSaveDTO(Meeting meeting, Presidency presidency) {
		this.id = meeting.getId();
		this.date = meeting.getDate();
		this.presidency = new PresidencySaveDTO(presidency.getId());
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

	public PresidencySaveDTO getPresidency() {
		return presidency;
	}

	public void setPresidency(PresidencySaveDTO presidency) {
		this.presidency = presidency;
	}
}
