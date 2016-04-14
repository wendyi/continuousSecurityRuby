package com.thoughtworks.recipe;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IngredientTypeMapperInterface {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "dietType", column = "dietType"),
            @Result(property = "ingredientType", column = "ingredientType")
    })
    @Select("SELECT id, ingredientType WHERE id = #{id}")
    Diet selectIngredientType(int id);

    @Select("SELECT ingredientType WHERE dietType = #{dietTYpe}")
    List<IngredientType> selectIngredientTypesFor(DietType dietType);
}