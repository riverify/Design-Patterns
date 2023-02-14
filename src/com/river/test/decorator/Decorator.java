package com.river.test.decorator;

/**
 * <p>Project: design-patterns - Decorator
 * <p>Powered by river On 2023/02/14 12:23 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Decorator implements Transform {

    private Transform transform;

    public Decorator(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
