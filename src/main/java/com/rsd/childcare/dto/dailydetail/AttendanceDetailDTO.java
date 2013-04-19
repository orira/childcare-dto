package com.rsd.childcare.dto.dailydetail;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AttendanceDetailDTO extends DailyDetailDTO{

	private Date signInTime;
	private Date signOutTime;
	private String signInAuthoriser;
	private String signOutAuthoriser;

	public Date getSignInTime() {
		return signInTime;
	}

	public void setSignInTime(Date signInTime) {
		this.signInTime = signInTime;
	}

	public Date getSignOutTime() {
		return signOutTime;
	}

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
	
	public long getTotalDailyAttendanceTime() {
		long duration = signOutTime.getTime() - signInTime.getTime();
		
		if(TimeUnit.MILLISECONDS.toHours(duration) >= 1) {
			return TimeUnit.MILLISECONDS.toHours(duration);
		} else {
			return TimeUnit.MILLISECONDS.toMinutes(duration);
		}
	}
}
