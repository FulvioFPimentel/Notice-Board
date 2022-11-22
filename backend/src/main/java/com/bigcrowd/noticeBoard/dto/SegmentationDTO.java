package com.bigcrowd.noticeBoard.dto;

import com.bigcrowd.noticeBoard.entities.Segmentation;

public class SegmentationDTO {

	
	private int time;
	private int moment;
	
	public SegmentationDTO () {}
	
	public SegmentationDTO(Segmentation segmentation) {
		time = segmentation.getTime();
		moment = segmentation.getMoment();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getMoment() {
		return moment;
	}

	public void setMoment(int moment) {
		this.moment = moment;
	}
	
}
