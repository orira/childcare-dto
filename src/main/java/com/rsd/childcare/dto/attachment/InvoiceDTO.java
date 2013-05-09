package com.rsd.childcare.dto.attachment;

import java.util.Date;

public class InvoiceDTO {
	
	private int id;
	private Date date;
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

	public AttachmentDTO getAttachment() {
		return attachment;
	}

	public void setAttachment(AttachmentDTO attachment) {
		this.attachment = attachment;
	}
}
