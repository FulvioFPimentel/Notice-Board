package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Canticle;

public class CanticleDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer number;
	private String title;	
	
	public CanticleDTO(Long id, Integer number, String title) {
		this.id = id;
		this.number = number;
		this.title = title;
	}
	
	public CanticleDTO(Canticle canticle) {
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
