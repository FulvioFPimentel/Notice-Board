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
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_designation")
public class Designation implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "assignment_id")
	private Assignment assignment;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToMany(mappedBy = "designations")
	private Set<SubSession> subsessions = new HashSet<>();
	
	@ManyToMany(mappedBy = "designations")
	private Set<Support> supports = new HashSet<>();
	
	@OneToOne(mappedBy = "designation")
	private Prayer prayer;	
	
	@OneToOne(mappedBy = "designation")
	private Presidency presidency;
	
	
	public Designation() {
	}

	public Designation(Long id, Assignment assignment, Person person) {
		this.id = id;
		this.assignment = assignment;
		this.person = person;
	}
	
	public Designation(Long id, Assignment assignment, Person person, Prayer prayer, Presidency presidency) {
		this.id = id;
		this.assignment = assignment;
		this.person = person;
		this.prayer = prayer;
		this.presidency = presidency;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Set<SubSession> getSubsessions() {
		return subsessions;
	}

	public Set<Support> getSupports() {
		return supports;
	}

	public Prayer getPrayer() {
		return prayer;
	}

	public void setPrayer(Prayer prayer) {
		this.prayer = prayer;
	}

	public Presidency getPresidency() {
		return presidency;
	}

	public void setPresidency(Presidency presidency) {
		this.presidency = presidency;
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
