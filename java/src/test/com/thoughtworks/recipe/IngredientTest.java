package com.thoughtworks.recipe;

import org.junit.Test;

import static com.thoughtworks.recipe.IngredientType.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IngredientTest {
	@Test
	public void dietIncludingMeatShouldAllowPorkChops() {
		// given
		Diet diet = mock(Diet.class);
		when(diet.allows(MEAT)).thenReturn(true);

		Ingredient porkChop = new Ingredient(MEAT);

		// then
		assertThat(porkChop.isPartOfDiet(diet), is(true));
	}

	@Test
	public void dietNotIncludingMeatShouldAllowPorkChops() {
		// given
		Diet diet = mock(Diet.class);
		when(diet.allows(VEGETABLE)).thenReturn(true);

		Ingredient porkChop = new Ingredient(MEAT);

		// then
		assertThat(porkChop.isPartOfDiet(diet), is(false));
	}



}