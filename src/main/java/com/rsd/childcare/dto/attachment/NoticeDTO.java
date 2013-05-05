package com.rsd.childcare.dto.attachment;

import java.util.Date;

public class NoticeDTO {
	
	private int id;
	
	private Date date;
	
	private String information;
	
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
}
