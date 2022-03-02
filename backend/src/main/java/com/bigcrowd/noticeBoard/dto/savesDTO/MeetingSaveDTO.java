package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Presidency;

public class MeetingSaveDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant date;
	private PresidencySaveDTO presidency;
	
	private List<CanticleSaveDTO> canticles = new ArrayList<>();
	private List<PrayerSaveDTO> prayers = new ArrayList<>();
	private Set<SessionSaveDTO> sessions = new HashSet<>();
	private Set<SubSessionSaveDTO> subsessions = new HashSet<>();
	private Set<SegmantationSaveDTO> segmentations = new LinkedHashSet<>();
		
	public MeetingSaveDTO() {
	}

	public MeetingSaveDTO(Long id, Instant date, Set<SegmantationSaveDTO> segmentations) {
		this.id = id;
		this.date = date;
	}
	
	public MeetingSaveDTO(Meeting meeting) {
		this.id = meeting.getId();
		this.date = meeting.getDate();
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

	public List<CanticleSaveDTO> getCanticles() {
		return canticles;
	}

	public List<PrayerSaveDTO> getPrayers() {
		return prayers;
	}

	public Set<SessionSaveDTO> getSessions() {
		return sessions;
	}

	public Set<SubSessionSaveDTO> getSubsessions() {
		return subsessions;
	}

	public Set<SegmantationSaveDTO> getSegmentations() {
		return segmentations;
	}
}
