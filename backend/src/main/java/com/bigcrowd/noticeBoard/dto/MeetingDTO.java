package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.CanticlesPerMeetings;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Prayer;
import com.bigcrowd.noticeBoard.entities.Segmentation;

public class MeetingDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private Instant date;
	private CongregationDTO congregation;
	private PresidencyDTO presidency;
	
	private Set<CanticlesPerMeetingsDTO> canticlesPerMeetings = new HashSet<>();
	private List<PrayerDTO> prayers = new ArrayList<>();
	private Set<SessionDTO> sessions = new HashSet<>();

	
	public MeetingDTO() {}
	
	public MeetingDTO(Long id, String title, Instant date) {
		this.id = id;
		this.title = title;
		this.date = date;
	}
	
	public MeetingDTO(Meeting meeting) {
		id = meeting.getId();
		title = meeting.getTitle();
		date = meeting.getDate();
		congregation = new CongregationDTO(meeting.getCongregation());
		presidency = new PresidencyDTO(meeting.getPresidency());	
	}
	
	public MeetingDTO(Meeting meeting, Set<CanticlesPerMeetings> canticlesPerMeetings, List<Prayer> prayers, Set<Segmentation> Segmentations) {
		this(meeting);
		canticlesPerMeetings.forEach(x -> this.canticlesPerMeetings.add(new CanticlesPerMeetingsDTO(x, x.getMoment())));
		prayers.forEach(x -> this.prayers.add(new PrayerDTO(x)));
		Segmentations.forEach(x -> this.sessions.add(new SessionDTO(x.getId().getSession(), Segmentations)));
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

	public CongregationDTO getCongregation() {
		return congregation;
	}

	public void setCongregation(CongregationDTO congregation) {
		this.congregation = congregation;
	}

	public PresidencyDTO getPresidency() {
		return presidency;
	}

	public void setPresidency(PresidencyDTO presidency) {
		this.presidency = presidency;
	}
	
	public Set<CanticlesPerMeetingsDTO> getCanticlesPerMeetings() {
		return canticlesPerMeetings;
	}

	public List<PrayerDTO> getPrayers() {
		return prayers;
	}

	public Set<SessionDTO> getSessions() {
		return sessions;
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
		MeetingDTO other = (MeetingDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
