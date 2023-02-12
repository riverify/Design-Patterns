package com.river.test.builder;

/**
 * <p>Project: design-patterns - MealsBuilder
 * <p>Powered by river On 2023/02/12 4:41 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public abstract class MealsBuilder {
    Meals meals = new Meals();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meals getMeals() {
        return meals;
    }
}
