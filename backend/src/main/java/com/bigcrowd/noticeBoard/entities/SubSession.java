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
@Table(name = "tb_subsession")
public class SubSession implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String subSession;
	
	@ManyToMany(mappedBy = "subsessions")
	private Set<Session> sessions = new HashSet<>();
	
	@ManyToMany(mappedBy = "subsessions")
	private Set<Meeting> meetings  = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_subsession_designation",
			joinColumns = @JoinColumn(name = "subsession_id"),
			inverseJoinColumns = @JoinColumn(name = "designation_id"))
	private Set<Designation> designations = new HashSet<>();
		
	public SubSession() {
	}

	public SubSession(Long id, String subSession) {
		super();
		this.id = id;
		this.subSession = subSession;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubSession() {
		return subSession;
	}

	public void setSubSession(String subSession) {
		this.subSession = subSession;
	}

	public Set<Session> getSessions() {
		return sessions;
	}

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public Set<Designation> getDesignations() {
		return designations;
	}

}
