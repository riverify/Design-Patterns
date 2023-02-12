package com.river.test.builder;

/**
 * <p>Project: design-patterns - Meals
 * <p>Powered by river On 2023/02/12 4:37 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Meals {
    private String food;
    private String drink;

    public Meals() {
    }

    public Meals(String food, String drink) {
        this.food = food;
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meals{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
