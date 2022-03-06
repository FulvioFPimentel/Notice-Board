package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.util.LinkedHashSet;
import java.util.Set;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Segmentation;

public class SegmantationSaveDTO {
	
	private MeetingSaveDTO meetingDTO;
	private SessionSaveDTO sessionDTO;
	private SubSessionSaveDTO subSessionDTO;
	
	private Set<DesignationSaveDTO> designations = new LinkedHashSet<>();

	public SegmantationSaveDTO(MeetingSaveDTO meetingDTO, SessionSaveDTO sessions, SubSessionSaveDTO subsessions) {
		this.meetingDTO = meetingDTO;
		this.sessionDTO = sessions;
		this.subSessionDTO = subsessions;
	}
	
	public SegmantationSaveDTO(Segmentation segmentation, Set<Designation> designation) {
		meetingDTO = new MeetingSaveDTO(segmentation.getId().getMeeting());
		sessionDTO = new SessionSaveDTO(segmentation.getId().getSession());
		subSessionDTO = new SubSessionSaveDTO(segmentation.getId().getSubsession());
		
		designation.forEach(x -> this.designations.add(new DesignationSaveDTO(x.getId(), x.getAssignment(), x.getPerson())));
		
	}

	public MeetingSaveDTO getMeetingDTO() {
		return meetingDTO;
	}

	public void setMeetingDTO(MeetingSaveDTO meetingDTO) {
		this.meetingDTO = meetingDTO;
	}

	public SessionSaveDTO getSessionDTO() {
		return sessionDTO;
	}

	public void setSessionDTO(SessionSaveDTO sessionDTO) {
		this.sessionDTO = sessionDTO;
	}

	public Set<DesignationSaveDTO> getDesignations() {
		return designations;
	}

	public void setDesignations(Set<DesignationSaveDTO> designations) {
		this.designations = designations;
	}

	public SubSessionSaveDTO getSubSessionDTO() {
		return subSessionDTO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designations == null) ? 0 : designations.hashCode());
		result = prime * result + ((meetingDTO == null) ? 0 : meetingDTO.hashCode());
		result = prime * result + ((sessionDTO == null) ? 0 : sessionDTO.hashCode());
		result = prime * result + ((subSessionDTO == null) ? 0 : subSessionDTO.hashCode());
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
		SegmantationSaveDTO other = (SegmantationSaveDTO) obj;
		if (designations == null) {
			if (other.designations != null)
				return false;
		} else if (!designations.equals(other.designations))
			return false;
		if (meetingDTO == null) {
			if (other.meetingDTO != null)
				return false;
		} else if (!meetingDTO.equals(other.meetingDTO))
			return false;
		if (sessionDTO == null) {
			if (other.sessionDTO != null)
				return false;
		} else if (!sessionDTO.equals(other.sessionDTO))
			return false;
		if (subSessionDTO == null) {
			if (other.subSessionDTO != null)
				return false;
		} else if (!subSessionDTO.equals(other.subSessionDTO))
			return false;
		return true;
	}	
}
