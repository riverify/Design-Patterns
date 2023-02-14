package com.river.test.bright;

/**
 * <p>Project: design-patterns - Client
 * <p>Powered by river On 2023/02/15 1:01 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Client {
    public static void main(String[] args) {

        Phone phone = new TouchPhone(new Huawei());
        phone.open();
        phone.call();
        phone.close();

    }
}
