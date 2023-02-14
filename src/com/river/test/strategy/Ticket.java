package com.river.test.strategy;

/**
 * <p>Project: design-patterns - Ticket
 * <p>Powered by river On 2023/02/15 2:09 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Ticket {
    private double price;

    private Discount count;

    public double getPrice() {
        return count.calculate(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getCount() {
        return count;
    }

    public void setCount(Discount count) {
        this.count = count;
    }
}
