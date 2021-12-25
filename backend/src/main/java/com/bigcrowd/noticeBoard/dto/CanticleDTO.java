package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Canticle;

public class CanticleDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int number;
	private String title;
	private String text;
	
	public CanticleDTO() {
	}

	public CanticleDTO(Long id, int number, String title, String text) {
		this.id = id;
		this.number = number;
		this.title = title;
		this.text = text;
	}
	
	public CanticleDTO(Canticle canticles) {
		this.id = canticles.getId();
		this.number = canticles.getNumber();
		this.title = canticles.getTitle();
		this.text = canticles.getText();
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}