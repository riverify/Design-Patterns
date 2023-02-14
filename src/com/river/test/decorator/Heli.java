package com.river.test.decorator;

/**
 * <p>Project: design-patterns - Heli
 * <p>Powered by river On 2023/02/14 12:26 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Heli extends Decorator {
    public Heli(Transform transform) {
        super(transform);
        System.out.println("我变成了直升机");
    }

    public void fly() {
        System.out.println("我在飞行");
    }

}
