package com.river.test.builder;

/**
 * <p>Project: design-patterns - SubMealsBuilderB
 * <p>Powered by river On 2023/02/12 4:47 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class SubMealsBuilderB extends MealsBuilder {
    @Override
    public void buildFood() {
        meals.setFood("一份肌肉卷");
    }

    @Override
    public void buildDrink() {
        meals.setDrink("一倍咖啡");
    }
}
