package com.river.test.builder;

/**
 * <p>Project: design-patterns - Waiter
 * <p>Powered by river On 2023/02/12 4:48 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Waiter {
    private MealsBuilder mealsBuilder;

    public void setMealsBuilder(MealsBuilder mealsBuilder) {
        this.mealsBuilder = mealsBuilder;
    }

    public Meals construct() {
        mealsBuilder.buildFood();
        mealsBuilder.buildDrink();
        return mealsBuilder.getMeals();
    }

}
