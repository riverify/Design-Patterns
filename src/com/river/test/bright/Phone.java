package com.river.test.bright;

/**
 * <p>Project: design-patterns - Phone
 * <p>Powered by river On 2023/02/15 12:50 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }
}
