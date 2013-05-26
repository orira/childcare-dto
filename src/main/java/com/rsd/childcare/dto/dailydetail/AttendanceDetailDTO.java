package com.rsd.childcare.dto.dailydetail;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rsd.childcare.dto.serialiser.CustomTimeDeserialiser;
import com.rsd.childcare.dto.serialiser.CustomTimeSerialiser;

public class AttendanceDetailDTO extends DailyDetailDTO{

	private Date signInTime;
	private Date signOutTime;
	private String signInAuthoriser;
	private String signOutAuthoriser;
	
	@JsonDeserialize(using = CustomTimeDeserialiser.class)	                    
	public Date getSignInTime() {
		return signInTime;
	}

	@JsonSerialize(using = CustomTimeSerialiser.class)
	public void setSignInTime(Date signInTime) {
		this.signInTime = signInTime;
	}

	@JsonDeserialize(using = CustomTimeDeserialiser.class)
	public Date getSignOutTime() {
		return signOutTime;
	}

	@JsonSerialize(using = CustomTimeSerialiser.class)
	public void setSignOutTime(Date signOutTime) {
		this.signOutTime = signOutTime;
	}

	public String getSignInAuthoriser() {
		return signInAuthoriser;
	}

	public void setSignInAuthoriser(String signInAuthoriser) {
		this.signInAuthoriser = signInAuthoriser;
	}

	public String getSignOutAuthoriser() {
		return signOutAuthoriser;
	}

	public void setSignOutAuthoriser(String signOutAuthoriser) {
		this.signOutAuthoriser = signOutAuthoriser;
	}	
	
	public long returnTotalDailyAttendanceTime() {
		long duration = signOutTime.getTime() - signInTime.getTime();
		
		if(TimeUnit.MILLISECONDS.toHours(duration) >= 1) {
			return TimeUnit.MILLISECONDS.toHours(duration);
		} else {
			return TimeUnit.MILLISECONDS.toMinutes(duration);
		}
	}
}
