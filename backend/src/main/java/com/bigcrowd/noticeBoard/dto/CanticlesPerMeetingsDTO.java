package com.bigcrowd.noticeBoard.dto;

import com.bigcrowd.noticeBoard.entities.CanticlesPerMeetings;

public class CanticlesPerMeetingsDTO {
	
	private MeetingDTO meeting;
	private CanticleDTO canticle;
	
	private int moment;
	
	public CanticlesPerMeetingsDTO(){}
		
	public CanticlesPerMeetingsDTO(CanticlesPerMeetings canticlesPerMeetings, int moment) {
		meeting = new MeetingDTO(canticlesPerMeetings.getMeeting());
		canticle = new CanticleDTO(canticlesPerMeetings.getCanticle());
		this.moment = moment; 
	}

	public MeetingDTO getMeeting() {
		return meeting;
	}

	public void setMeeting(MeetingDTO meeting) {
		this.meeting = meeting;
	}

	public CanticleDTO getCanticle() {
		return canticle;
	}

	public void setCanticle(CanticleDTO canticle) {
		this.canticle = canticle;
	}

	public int getMoment() {
		return moment;
	}

	public void setMoment(int moment) {
		this.moment = moment;
	}
	
}
