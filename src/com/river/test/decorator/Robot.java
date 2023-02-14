package com.river.test.decorator;

/**
 * <p>Project: design-patterns - Robot
 * <p>Powered by river On 2023/02/14 12:22 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Robot implements Transform {
    @Override
    public void move() {
        System.out.println("人形变形金刚正在走路...");
    }
}
