package com.rsd.childcare.dto.dailydetail;

import java.util.List;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.annotate.JsonTypeInfo;

public class DataWrapperDTO {
	
	@JsonTypeInfo(use= JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="type")
	@JsonSubTypes({
	    @Type(value = AttendanceDetailDTO.class, name = "Attendance"),
	    @Type(value = DialogueDetailDTO.class, name = "Dialogue"),
	    @Type(value = FoodDetailDTO.class, name = "Food"),
	    @Type(value = IncidentDetailDTO.class, name = "Incident"),
	    @Type(value = MedicineDetailDTO.class, name = "Medicine"),
	    @Type(value = SleepDetailDTO.class, name = "Sleep"),
	    @Type(value = ToiletDetailDTO.class, name = "T")
	    })
	
	List<DailyDetailDTO> dtos;

	public List<DailyDetailDTO> getDtos() {
		return dtos;
	}

	public void setDtos(List<DailyDetailDTO> dtos) {
		this.dtos = dtos;
	}
}
