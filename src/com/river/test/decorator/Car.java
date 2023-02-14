package com.river.test.decorator;

/**
 * <p>Project: design-patterns - Car
 * <p>Powered by river On 2023/02/14 12:24 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Car extends Decorator {
    public Car(Transform transform) {
        super(transform);
        System.out.println("我变成了汽车");
    }

    public void driver() {
        System.out.println("我在驾驶汽车");
    }
}
