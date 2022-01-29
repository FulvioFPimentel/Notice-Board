package com.bigcrowd.noticeBoard.dto;

import com.bigcrowd.noticeBoard.entities.Role;

public class RoleDTO {

	private Long id;
	private String privilege;
	
	public RoleDTO(Long id, String privilege) {
		this.id = id;
		this.privilege = privilege;
	}

	public RoleDTO(Role role) {
		id = role.getId();
		privilege = role.getPrivilege();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
		
}
