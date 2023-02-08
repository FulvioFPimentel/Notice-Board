package com.bigcrowd.noticeBoard.dto;

import java.io.Serializable;

import com.bigcrowd.noticeBoard.entities.Congregation;

public class CongregationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String city;
	
	public CongregationDTO() {}
	
	public CongregationDTO(Long id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public CongregationDTO(Congregation congregation) {
		id = congregation.getId();
		name = congregation.getName();
		city = congregation.getCity();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
