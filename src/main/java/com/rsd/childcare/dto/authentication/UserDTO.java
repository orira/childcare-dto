package com.rsd.childcare.dto.authentication;

import com.rsd.childcare.dto.person.ParentDTO;

public class UserDTO {
	
	private int id;
	private String userName;
	private String password;
	private ParentDTO parent;
	
	public UserDTO(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public UserDTO() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ParentDTO getParent() {
		return parent;
	}

	public void setParent(ParentDTO parent) {
		this.parent = parent;
	}
}
