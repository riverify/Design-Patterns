package com.river.test.bright;

/**
 * <p>Project: design-patterns - TouchPhone
 * <p>Powered by river On 2023/02/15 12:53 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class TouchPhone extends Phone {


    public TouchPhone(Brand brand) {
        super(brand);
    }


    @Override
    public void open() {
        System.out.println("5G，中国核心科技");
        super.open();
    }

    @Override
    public void call() {
        System.out.println("5G，中国核心科技");
        super.call();
    }

    @Override
    public void close() {
        System.out.println("5G，中国核心科技");
        super.close();
    }
}
