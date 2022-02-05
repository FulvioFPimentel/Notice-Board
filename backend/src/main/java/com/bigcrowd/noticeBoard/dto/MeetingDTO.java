package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Canticle;
import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Prayer;
import com.bigcrowd.noticeBoard.entities.Session;

public class MeetingDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant date;
	private PresidencyDTO presidency;
	
	private Set<CanticleDTO> canticles = new HashSet<>();
	private List<PrayerDTO> prayers = new ArrayList<>();
	private Set<SessionDTO> sessions = new HashSet<>();
	
	public MeetingDTO() {}
	
	public MeetingDTO(Long id, Instant date) {
		this.id = id;
		this.date = date;
	}
	
	public MeetingDTO(Meeting meeting) {
		id = meeting.getId();
		date = meeting.getDate();
		presidency = new PresidencyDTO(meeting.getPresidency());	
	}
	
	public MeetingDTO(Meeting meeting, Set<Canticle> canticles, List<Prayer> prayers, Set<Session> sessions) {
		this(meeting);
		canticles.forEach(x -> this.canticles.add(new CanticleDTO(x)));
		prayers.forEach(x -> this.prayers.add(new PrayerDTO(x)));
		sessions.forEach(x -> this.sessions.add(new SessionDTO(x, x.getSubsessions())));
		
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

	public PresidencyDTO getPresidency() {
		return presidency;
	}

	public void setPresidency(PresidencyDTO presidency) {
		this.presidency = presidency;
	}

	public Set<CanticleDTO> getCanticles() {
		return canticles;
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
