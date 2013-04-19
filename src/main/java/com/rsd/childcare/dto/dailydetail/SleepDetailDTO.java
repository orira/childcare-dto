package com.rsd.childcare.dto.dailydetail;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SleepDetailDTO extends DailyDetailDTO{

	private Date sleptTime;
	private String sleptAuthoriser;
	private Date awokeTime;	
	private String awokeAuthoriser;

	
	public Date getSleptTime() {
		return sleptTime;
	}

	public void setSleptTime(Date sleptTime) {
		this.sleptTime = sleptTime;
	}

	public String getSleptAuthoriser() {
		return sleptAuthoriser;
	}

	public void setSleptAuthoriser(String sleptAuthoriser) {
		this.sleptAuthoriser = sleptAuthoriser;
	}

	public Date getAwokeTime() {
		return awokeTime;
	}

	public void setAwokeTime(Date awokeTime) {
		this.awokeTime = awokeTime;
	}

	public String getAwokeAuthoriser() {
		return awokeAuthoriser;
	}

	public void setAwokeAuthoriser(String awokeAuthoriser) {
		this.awokeAuthoriser = awokeAuthoriser;
	}
	
	public long getTotalSleptTime() {
		long duration = awokeTime.getTime() - sleptTime.getTime();
		
		if(TimeUnit.MILLISECONDS.toHours(duration) >= 1) {
			return TimeUnit.MILLISECONDS.toHours(duration);
		} else {
			return TimeUnit.MILLISECONDS.toMinutes(duration);
		}
	}
}
