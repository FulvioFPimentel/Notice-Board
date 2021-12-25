package com.bigcrowd.noticeBoard.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private String presidency;
	
	@OneToMany(mappedBy = "meeting")
	private List<Canticle> canticles = new ArrayList<>();
	
	@OneToMany(mappedBy = "meeting")
	private List<Prayer> prayers = new ArrayList<>();
	
	@OneToMany(mappedBy = "meeting")
	private List<Session> sessions = new ArrayList<>();
	
	public Meeting() {
	}

	public Meeting(Long id, String presidency, Instant date) {

		this.presidency = presidency;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPresidency() {
		return presidency;
	}

	public void setPresidency(String presidency) {
		this.presidency = presidency;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}
	
	public List<Canticle> getCanticles() {
		return canticles;
	}

	public List<Prayer> getPrayers() {
		return prayers;
	}
	
	public List<Session> getSessions() {
		return sessions;
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
