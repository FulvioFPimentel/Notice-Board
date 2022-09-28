package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.bigcrowd.noticeBoard.dto.CanticlesPerMeetingsDTO;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Presidency;

public class MeetingSaveDTO  implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Instant date;
	private PresidencySaveDTO presidency;
	
	private List<CanticlesPerMeetingsDTO> canticlesPerMeetings = new ArrayList<>();
	private List<PrayerSaveDTO> prayers = new ArrayList<>();
	private List<SessionSaveDTO> sessions = new ArrayList<>();
	private Set<SubSessionSaveDTO> subsessions = new HashSet<>();
	private Set<SegmantationSaveDTO> segmentations = new LinkedHashSet<>();
		
	public MeetingSaveDTO() {
	}

	public MeetingSaveDTO(Long id, String title, Instant date, Set<SegmantationSaveDTO> segmentations) {
		this.id = id;
		this.title = title;
		this.date = date;
	}
	
	public MeetingSaveDTO(Meeting meeting) {
		this.id = meeting.getId();
		this.title = meeting.getTitle();
		this.date = meeting.getDate();
	}
	
	public MeetingSaveDTO(Meeting meeting, Presidency presidency) {
		this.id = meeting.getId();
		this.title = meeting.getTitle();
		this.date = meeting.getDate();
		this.presidency = new PresidencySaveDTO(presidency.getId());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<CanticlesPerMeetingsDTO> getCanticlesPerMeetings() {
		return canticlesPerMeetings;
	}

	public List<PrayerSaveDTO> getPrayers() {
		return prayers;
	}

	public List<SessionSaveDTO> getSessions() {
		return sessions;
	}

	public Set<SubSessionSaveDTO> getSubsessions() {
		return subsessions;
	}

	public Set<SegmantationSaveDTO> getSegmentations() {
		return segmentations;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeetingSaveDTO other = (MeetingSaveDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
