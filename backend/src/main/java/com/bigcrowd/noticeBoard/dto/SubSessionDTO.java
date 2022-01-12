package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bigcrowd.noticeBoard.entities.Participant;
import com.bigcrowd.noticeBoard.entities.SubSession;

public class SubSessionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String subSession;
	
	private List<ParticipantDTO> ParticipantDTO = new ArrayList<>(); 

	public SubSessionDTO() {
	}
	
	public SubSessionDTO(SubSession subSessions, List<Participant> Participant) {
		this.id = subSessions.getId();
		this.subSession = subSessions.getSubSession();
		Participant.forEach(x -> this.ParticipantDTO.add(new ParticipantDTO(x, x.getPerson())));
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

	public List<ParticipantDTO> getParticipant() {
		return ParticipantDTO;
	}
	
}
