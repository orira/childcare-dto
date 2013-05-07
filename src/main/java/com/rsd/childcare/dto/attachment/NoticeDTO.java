package com.rsd.childcare.dto.attachment;

import java.util.Date;

public class NoticeDTO {
	
	private int id;
	
	private Date date;
	
	private String title;
	
	private String author;
	
	private String information;
	
	private AttachmentDTO attachment;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public AttachmentDTO getAttachment() {
		return attachment;
	}

	public void setAttachment(AttachmentDTO attachment) {
		this.attachment = attachment;
	}
}
