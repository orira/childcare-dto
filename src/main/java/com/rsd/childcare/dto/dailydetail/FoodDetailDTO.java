package com.rsd.childcare.dto.dailydetail;

import com.rsd.childcare.dto.categories.FoodTimeCategory;


public class FoodDetailDTO extends DailyDetailDTO{

	private FoodTimeCategory timeCategory;
	private String foodAuthoriser;
	private String foodItem;	
	private String portion;

	public FoodTimeCategory getTimeCategory() {
		return timeCategory;
	}

	public void setTimeCategory(FoodTimeCategory timeCategory) {
		this.timeCategory = timeCategory;
	}

	public String getFoodAuthoriser() {
		return foodAuthoriser;
	}

	public void setFoodAuthoriser(String foodAuthoriser) {
		this.foodAuthoriser = foodAuthoriser;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public String getPortion() {
		return portion;
	}

	public void setPortion(String portion) {
		this.portion = portion;
	}	
}
