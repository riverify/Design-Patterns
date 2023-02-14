package com.river.test.decorator;

/**
 * <p>Project: design-patterns - Client
 * <p>Powered by river On 2023/02/14 12:27 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Client {
    public static void main(String[] args) {
        Transform robot_1 = new Robot();
        robot_1.move();
        Car car = new Car(robot_1);
        car.driver();

        System.out.println("======================================");

        Transform robot_2 = new Robot();
        robot_2.move();
        Heli heli = new Heli(robot_2);
        heli.fly();
    }
}
