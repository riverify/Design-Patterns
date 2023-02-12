package com.river.test.builder;

/**
 * <p>Project: design-patterns - Demo
 * <p>Powered by river On 2023/02/12 4:52 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Demo {
    public static void main(String[] args) {
        MealsBuilder ms = new SubMealsBuilderA();
        Waiter waiter = new Waiter();
        waiter.setMealsBuilder(ms);
        Meals meals = waiter.construct();

        System.out.println(meals);

    }
}
