package com.rsd.childcare.dto.person;


import java.util.List;

import com.rsd.childcare.dto.authentication.AuthenticationDetailsDTO;

public class ParentDTO extends PersonDTO{
	
	private List<ChildDTO> children;
	private AuthenticationDetailsDTO authenticationDetails;
	
	public List<ChildDTO> getChildren() {
		return children;
	}

	public void setChildren(List<ChildDTO> children) {
		this.children = children;
	}

	public AuthenticationDetailsDTO getAuthenticationDetails() {
		return authenticationDetails;
	}

	public void setAuthenticationDetails(AuthenticationDetailsDTO authenticationDetails) {
		this.authenticationDetails = authenticationDetails;
	}	
}
