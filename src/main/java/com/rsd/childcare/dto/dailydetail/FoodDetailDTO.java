package com.rsd.childcare.dto.dailydetail;

import com.rsd.childcare.dto.categories.FoodTimeCategory;

public class FoodDetailDTO extends DailyDetailDTO{

	private FoodTimeCategory category;
	private String authoriser;
	private String type;
	private String portion;
	
	public FoodTimeCategory getCategory() {
		return category;
	}
	
	public void setCategory(FoodTimeCategory category) {
		this.category = category;
	}
	
	public String getAuthoriser() {
		return authoriser;
	}

	public void setAuthoriser(String authoriser) {
		this.authoriser = authoriser;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPortion() {
		return portion;
	}
	
	public void setPortion(String portion) {
		this.portion = portion;
	}
}
