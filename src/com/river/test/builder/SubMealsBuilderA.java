package com.river.test.builder;

/**
 * <p>Project: design-patterns - SubMealsBuilderA
 * <p>Powered by river On 2023/02/12 4:44 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class SubMealsBuilderA extends MealsBuilder {
    @Override
    public void buildFood() {
        meals.setFood("一份汉堡\uD83C\uDF54、一份薯条🍟");
    }

    @Override
    public void buildDrink() {
        meals.setDrink("一杯中可");

    }
}
