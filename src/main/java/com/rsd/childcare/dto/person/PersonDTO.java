package com.rsd.childcare.dto.person;


import java.util.Date;

import com.rsd.childcare.dto.contactdetails.ContactDetailsDTO;

public abstract class PersonDTO {
	
	private int id;
	private String firstName;
	private String secondName;
	private String middleName;
	private String familyName;
	private String sex;
	private Date dateOfBirth;
	private ContactDetailsDTO contactDetails;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public ContactDetailsDTO getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetailsDTO contactDetails) {
		this.contactDetails = contactDetails;
	}
}
