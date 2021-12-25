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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_designation")
public class Designation implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subsession_id")
	private SubSession subsession;
		
	@ManyToMany
	@JoinTable(name = "tb_designation_person",
		joinColumns = @JoinColumn(name = "designation_id"), 
		inverseJoinColumns = @JoinColumn(name = "person_id"))
	private List<Person> persons = new ArrayList<>();
	
	public Designation() {
	}

	public Designation(Long id, String designation, SubSession subsession) {
		this.id = id;
		this.designation = designation;
		this.subsession = subsession;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Person> getPersons() {
		return persons;
	}
	
	public SubSession getMeeting() {
		return subsession;
	}
	
	public SubSession getSubsession() {
		return subsession;
	}

	public void setSubsession(SubSession subsession) {
		this.subsession = subsession;
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
		Designation other = (Designation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		
}
