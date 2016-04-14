package com.thoughtworks.recipe;

import java.util.List;
import java.util.Map;

public class IngredientTypeMapper {
    private Map<DietType, List<IngredientType>> dietTypes;


    List<IngredientType> selectIngredientTypesFor(DietType dietType) {
        return dietTypes.get(dietType);
    }
}
