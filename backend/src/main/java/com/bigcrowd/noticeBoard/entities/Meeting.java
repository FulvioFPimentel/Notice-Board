package com.bigcrowd.noticeBoard.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_meeting")
public class Meeting implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant date;
	
	@OneToOne(mappedBy = "meeting")
	private Presidency presidency;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_meeting_canticle",
		joinColumns = @JoinColumn(name = "meeting_id"),
		inverseJoinColumns = @JoinColumn(name = "canticle_id")
	)
	private Set<Canticle> canticles = new HashSet<>();
	
	@OneToMany(mappedBy = "meeting")
	private List<Prayer> prayers = new ArrayList<>();
		
	@ManyToMany
	@JoinTable(name = "tb_meeting_session",
		joinColumns = @JoinColumn(name = "meeting_id"),
		inverseJoinColumns = @JoinColumn(name = "session_id"))
	private Set<Session> sessions = new LinkedHashSet<>();
	
	@ManyToMany
	@JoinTable(name = "tb_meeting_subsession",
		joinColumns = @JoinColumn(name = "meeting_id"),
		inverseJoinColumns = @JoinColumn(name = "subsession_id"))
	private Set<SubSession> subsessions = new LinkedHashSet<>();
		
	public Meeting() {
	}

	public Meeting(Long id, Instant date, Presidency presidency) {
		super();
		this.id = id;
		this.date = date;
		this.presidency = presidency;
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

	public Presidency getPresidency() {
		return presidency;
	}

	public void setPresidency(Presidency presidency) {
		this.presidency = presidency;
	}

	public List<Prayer> getPrayers() {
		return prayers;
	}

	public Set<Canticle> getCanticles() {
		return canticles;
	}

	public Set<Session> getSessions() {
		return sessions;
	}

	public Set<SubSession> getSubsessions() {
		return subsessions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Meeting other = (Meeting) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
