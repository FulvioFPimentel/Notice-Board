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
import javax.persistence.ManyToOne;
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
	private String title;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "congragation_id")
	private Congregation congregation;
		
	@OneToOne(mappedBy = "meeting")
	private Presidency presidency;
	
	@OneToMany(mappedBy = "id.meeting")
	private Set<CanticlesPerMeetings> canticlesPerMeetings = new HashSet<>();
	
	@OneToMany(mappedBy = "meeting")
	private List<Prayer> prayers = new ArrayList<>();
	
	@OneToMany(mappedBy = "meeting")
	private List<Support> supports = new ArrayList<>();
	
	@OneToMany(mappedBy = "id.meeting")
	private Set<Segmentation> segmentations = new LinkedHashSet<>();
		
	public Meeting() {
	}

	public Meeting(Long id, String title, Instant date, Congregation congregation, Presidency presidency) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.congregation = congregation;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Congregation getCongregation() {
		return congregation;
	}

	public void setCongregation(Congregation congregation) {
		this.congregation = congregation;
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
	
	public List<Support> getSupports() {
		return supports;
	}
	
	public Set<CanticlesPerMeetings> getCanticlesPerMeetings() {
		return canticlesPerMeetings;
	}

	public void setCanticlesPerMeetings(Set<CanticlesPerMeetings> canticlesPerMeetings) {
		this.canticlesPerMeetings = canticlesPerMeetings;
	}

	public Set<Segmentation> getSegmentations() {
		return segmentations;
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
