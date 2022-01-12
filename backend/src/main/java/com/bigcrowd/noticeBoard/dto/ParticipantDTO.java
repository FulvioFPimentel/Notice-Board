package com.bigcrowd.noticeBoard.dto;

import com.bigcrowd.noticeBoard.entities.Participant;
import com.bigcrowd.noticeBoard.entities.Person;

public class ParticipantDTO extends DesignationDTO{
	private static final long serialVersionUID = 1L;

	private String person;
		
	public ParticipantDTO(Participant participant ,Person person) {
		super(participant);
		this.person = person.getName();
		
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	
}
