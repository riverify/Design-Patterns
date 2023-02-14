package com.river.test.strategy;

/**
 * <p>Project: design-patterns - VIPdiscount
 * <p>Powered by river On 2023/02/15 2:11 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class VIPdiscount implements Discount {
    @Override
    public double calculate(double price) {
        if (price > 40) {
            return price - 10;
        } else {
            return price;
        }
    }
}
