package com.rsd.childcare.dto.person;


import java.util.Date;
import java.util.List;

public class ChildDTO extends PersonDTO{
	
	private String classRoom;
	
	private Date startDate;
	
	private List<String> allergies;

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}		
}
