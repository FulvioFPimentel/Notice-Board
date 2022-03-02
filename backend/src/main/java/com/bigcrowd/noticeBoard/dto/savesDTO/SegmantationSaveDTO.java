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
	
}
