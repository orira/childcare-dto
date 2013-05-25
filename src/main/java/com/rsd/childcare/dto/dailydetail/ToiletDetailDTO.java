package com.rsd.childcare.dto.dailydetail;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

import com.rsd.childcare.dto.categories.ToiletType;
import com.rsd.childcare.dto.serialiser.CustomTimeDeserialiser;

public class ToiletDetailDTO extends DailyDetailDTO{
	
	private String toiletRecorder;
	private Date toiletTime;	
	private ToiletType toiletType;

	public String getToiletRecorder() {
		return toiletRecorder;
	}

	public void setToiletRecorder(String toiletRecorder) {
		this.toiletRecorder = toiletRecorder;
	}

	@JsonDeserialize(using = CustomTimeDeserialiser.class)
	public Date getToiletTime() {
		return toiletTime;
	}

	public void setToiletTime(Date toiletTime) {
		this.toiletTime = toiletTime;
	}

	public ToiletType getToiletType() {
		return toiletType;
	}

	public void setToiletType(ToiletType toiletType) {
		this.toiletType = toiletType;
	}	
}
