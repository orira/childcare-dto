package com.rsd.childcare.dto.dailydetail;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.rsd.childcare.dto.serialiser.CustomTimeDeserialiser;

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

	@JsonDeserialize(using = CustomTimeDeserialiser.class)
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
