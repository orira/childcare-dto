package com.rsd.childcare.dto.attachment;

import com.rsd.childcare.dto.person.PersonDTO;


public class AttachmentDTO {
	
	private int id;
	private String mimeType;
	private byte[] attachment;
	private PersonDTO person;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public byte[] getAttachment() {
		return attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	public PersonDTO getPerson() {
		return person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}
}
