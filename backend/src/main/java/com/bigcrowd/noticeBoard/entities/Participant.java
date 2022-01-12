package com.bigcrowd.noticeBoard.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_participant")
public class Participant extends Designation {
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subsession_id")
	private SubSession subsession;
	
	public Participant() {}

	public Participant(Long id, String designation, SubSession subsession) {
		super(id, designation);
		this.subsession = subsession;
	}

	public SubSession getSubsession() {
		return subsession;
	}

	public void setSubsession(SubSession subsession) {
		this.subsession = subsession;
	}

}
