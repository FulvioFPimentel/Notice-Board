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
@Table(name = "tb_subsession")
public class SubSession implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String subSession;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "session_id")
	private Session session;
	
	@OneToMany(mappedBy = "subsession")
	private List<Designation> designations = new ArrayList<>();
		
	public SubSession() {
	}

	public SubSession(Long id, String subSession, Session session) {
		this.id = id;
		this.subSession = subSession;
		this.session = session;
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

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public List<Designation> getDesignations() {
		return designations;
	}
	
}