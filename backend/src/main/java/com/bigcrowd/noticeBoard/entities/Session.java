package com.bigcrowd.noticeBoard.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_session")
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String session;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "meeting_id")
	private Meeting meeting;
	
	@OneToMany(mappedBy = "session")
	private List<SubSession> SubSessions = new ArrayList<>();
	
	public Session() {
	}

	public Session(Long id, String session, Meeting meeting) {
		this.id = id;
		this.session = session;
		this.meeting = meeting;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public List<SubSession> getSubSessions() {
		return SubSessions;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

}
