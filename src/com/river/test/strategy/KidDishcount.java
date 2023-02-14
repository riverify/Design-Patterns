package com.river.test.strategy;

/**
 * <p>Project: design-patterns - KidDishcount
 * <p>Powered by river On 2023/02/15 2:12 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class KidDishcount implements Discount {

    @Override
    public double calculate(double price) {
        return price * 0.5;
    }
}
