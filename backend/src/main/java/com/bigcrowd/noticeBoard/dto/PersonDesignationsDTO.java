package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Person;

public class PersonDesignationsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String person;
	private List<ListDesignationDTO> designations = new ArrayList<>();
	
	public PersonDesignationsDTO(String person, String task, String subsession) {
		this.person = person;
	}
	
	public PersonDesignationsDTO(Person person, List<Designation> designations) {
		this.person = person.getName();
		
		for(Designation x: designations) {
			
			if(!x.getSupports().isEmpty()) {
				this.designations.add(new DesignationsSupportDTO(x));
			}
			
			if(!x.getSubsessions().isEmpty()) {
				this.designations.add(new DesignationsSubSessionDTO(x));
			}
			
			if(x.getPrayer() != null){
				this.designations.add(new DesignationsPreyerDTO(x));
			}
			
			if(x.getPresidency() != null) {
				this.designations.add(new DesignationsPresidencyDTO(x));
			}
		}
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public List<ListDesignationDTO> getDesignations() {
		return designations;
	}
}
