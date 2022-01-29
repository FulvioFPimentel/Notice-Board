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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_support")
public class Support implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "meeting_id")
	private Meeting meeting;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_support_designation",
			joinColumns = @JoinColumn(name = "support_id"),
			inverseJoinColumns = @JoinColumn(name = "designation_id"))
	private Set<Designation> designations = new HashSet<>();
		
	public Support() {
	}
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public Set<Designation> getDesignations() {
		return designations;
	}

	public Support(Meeting meeting) {
		this.meeting = meeting;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}	
	
}
