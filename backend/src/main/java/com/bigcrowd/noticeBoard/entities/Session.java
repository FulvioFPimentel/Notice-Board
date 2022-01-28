package com.bigcrowd.noticeBoard.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_session")
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String session;
	
	@ManyToMany(mappedBy = "sessions")
	private Set<Meeting> meetings = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_session_subsession",
			joinColumns = @JoinColumn(name = "session_id"),
			inverseJoinColumns = @JoinColumn(name = "subsession_id"))
	private Set<SubSession> subsessions = new HashSet<>();
	
	public Session() {
	}

	public Session(Long id, String session) {
		this.id = id;
		this.session = session;
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

	public Set<SubSession> getSubsessions() {
		return subsessions;
	}
	
}
