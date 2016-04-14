package com.thoughtworks.recipe;

public class Diet {
    private DietType dietType;
    private IngredientTypeMapper mapper = new IngredientTypeMapper();

    public Diet(DietType dietType) {
        this.dietType = dietType;
    }

    void setMapper(IngredientTypeMapper mapper) {
        this.mapper = mapper;
    }

    public boolean allows(IngredientType ingredientType) {
        return mapper.selectIngredientTypesFor(dietType).contains(ingredientType);
    }
}
