package com.rsd.childcare.dto.person;


import java.util.List;

import com.rsd.childcare.dto.authentication.UserDTO;

public class ParentDTO extends PersonDTO{
	
	private List<ChildDTO> children;
	private UserDTO user;
	
	public List<ChildDTO> getChildren() {
		return children;
	}

	public void setChildren(List<ChildDTO> children) {
		this.children = children;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}	
}
