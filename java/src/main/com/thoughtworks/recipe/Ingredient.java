package com.thoughtworks.recipe;

public class Ingredient {
    private IngredientType ingredientType;

    public Ingredient(IngredientType ingredientType) {
        this.ingredientType = ingredientType;
    }

    public boolean isPartOfDiet(Diet diet) {
        return true;
    }
}
