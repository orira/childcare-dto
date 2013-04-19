package com.rsd.childcare.dto.dailydetail;

import java.util.Date;

import com.rsd.childcare.dto.person.ChildDTO;

public abstract class DailyDetailDTO {

	private int id;
	private Date date;
	private ChildDTO child;

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

	public ChildDTO getChild() {
		return child;
	}

	public void setChild(ChildDTO child) {
		this.child = child;
	}
}
