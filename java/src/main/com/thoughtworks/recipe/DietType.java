package com.thoughtworks.recipe;

public enum DietType {
	VEGETARIAN, OMNIVORIAN;

	public boolean includes(IngredientType ingredientType) {
		return false;
	}
}