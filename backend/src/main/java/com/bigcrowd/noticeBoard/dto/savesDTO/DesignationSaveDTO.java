package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Prayer;

public class DesignationSaveDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private AssignmentSaveDTO assignment;
	private PersonSaveDTO person;
	
	//private Set<SubSession> subsessions = new HashSet<>();
	//private Set<Support> supports = new HashSet<>();

	private Prayer prayer;	
	private PresidencySaveDTO presidency;
		
	public DesignationSaveDTO(Long id, AssignmentSaveDTO assignment, PersonSaveDTO person,
			PresidencySaveDTO presidency) {
		this.id = id;
		this.assignment = assignment;
		this.person = person;
		this.presidency = presidency;
	}

	public DesignationSaveDTO(Designation designation) {
		
		id = designation.getId();
		assignment = new AssignmentSaveDTO(designation.getAssignment());
		person = new PersonSaveDTO(designation.getPerson());
		presidency = new PresidencySaveDTO(designation.getPresidency());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AssignmentSaveDTO getAssignment() {
		return assignment;
	}

	public PersonSaveDTO getPerson() {
		return person;
	}
	
	public PresidencySaveDTO getPresidency() {
		return presidency;
	}

	public Prayer getPrayer() {
		return prayer;
	}

	public void setPrayer(Prayer prayer) {
		this.prayer = prayer;
	}
}
