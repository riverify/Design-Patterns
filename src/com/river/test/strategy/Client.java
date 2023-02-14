package com.river.test.strategy;

/**
 * <p>Project: design-patterns - Client
 * <p>Powered by river On 2023/02/15 2:13 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Client {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setPrice(72.5d);
        ticket.setCount(new KidDishcount());
        System.out.println("打折后" + ticket.getPrice());
    }
}
