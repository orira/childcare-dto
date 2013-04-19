package com.rsd.childcare.dto.dailydetail;

import java.util.Date;

public class MedicineDetailDTO extends DailyDetailDTO{

	private Date administeredTime;
	private String medicineAuthoriser;
	private String dosage;
	private String medicine;

	public Date getAdministeredTime() {
		return administeredTime;
	}

	public void setAdministeredTime(Date administeredTime) {
		this.administeredTime = administeredTime;
	}

	public String getMedicineAuthoriser() {
		return medicineAuthoriser;
	}

	public void setMedicineAuthoriser(String medicineAuthoriser) {
		this.medicineAuthoriser = medicineAuthoriser;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
}
