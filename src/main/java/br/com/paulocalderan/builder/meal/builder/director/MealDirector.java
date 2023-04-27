package br.com.paulocalderan.builder.meal.builder.director;

import br.com.paulocalderan.builder.meal.builder.builder.FastFoodMealBuilder;
import br.com.paulocalderan.builder.meal.builder.model.FastFoodMeal;

public class MealDirector {

    private FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {
        return builder.getMeal();
    }
}
