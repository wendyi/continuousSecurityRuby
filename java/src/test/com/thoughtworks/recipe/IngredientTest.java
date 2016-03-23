package com.thoughtworks.recipe;

import org.junit.Test;

public class IngredientTest {
	@Test
	public void vegetablesShouldBeVegan() {
		// given
		Ingredient celery = new Ingredient(IngredientType.VEGETABLE);

		// then
		assert(celery.isPartOfDiet(Diet.VEGAN));
	}
}