package com.rsd.childcare.dto.dailydetail;

import java.util.Date;

public class IncidentDetailDTO extends DailyDetailDTO{
	
	private String incidentRecorder;
	private Date incidentTime;	
	private String summary;

	public String getIncidentRecorder() {
		return incidentRecorder;
	}

	public void setIncidentRecorder(String incidentRecorder) {
		this.incidentRecorder = incidentRecorder;
	}

	public Date getIncidentTime() {
		return incidentTime;
	}

	public void setIncidentTime(Date incidentTime) {
		this.incidentTime = incidentTime;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
