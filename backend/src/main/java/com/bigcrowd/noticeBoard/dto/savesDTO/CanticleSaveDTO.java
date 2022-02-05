package com.bigcrowd.noticeBoard.dto.savesDTO;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Canticle;

public class CanticleSaveDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int number;
	private String title;
	
	public CanticleSaveDTO(Long id, int number, String title) {
		this.id = id;
		this.number = number;
		this.title = title;
	}
	
	public CanticleSaveDTO(Canticle canticle) {
		id = canticle.getId();
		number = canticle.getNumber();
		title = canticle.getTitle();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}
