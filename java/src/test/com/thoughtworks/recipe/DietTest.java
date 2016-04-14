package com.thoughtworks.recipe;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import static com.thoughtworks.recipe.DietType.OMNIVORIAN;
import static com.thoughtworks.recipe.DietType.VEGETARIAN;
import static com.thoughtworks.recipe.IngredientType.FRUIT;
import static com.thoughtworks.recipe.IngredientType.MEAT;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DietTest {
    private IngredientTypeMapper mapper;

    @Before
    public void given() {
        mapper = mock(IngredientTypeMapper.class);
        when(mapper.selectIngredientTypesFor(VEGETARIAN)).thenReturn(ImmutableList.of(FRUIT));
        when(mapper.selectIngredientTypesFor(DietType.OMNIVORIAN)).thenReturn(ImmutableList.of(FRUIT, MEAT));
    }

    @Test
    public void omnivorianDietShouldAllowFruitAndMeat() {
        // given
        Diet diet = new Diet(OMNIVORIAN);
        diet.setMapper(mapper);

        // then
        assertThat(diet.allows(FRUIT), is(true));
        assertThat(diet.allows(MEAT), is(true));
    }

    @Test
    public void vegetarianDietShouldNotAllowMeat() {
        // given
        Diet diet = new Diet(VEGETARIAN);
        diet.setMapper(mapper);

        // then
        assertThat(diet.allows(MEAT), is(false));
    }
}