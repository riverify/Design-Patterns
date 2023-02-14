package com.river.test.proxy;

/**
 * <p>Project: design-patterns - Client
 * <p>Powered by river On 2023/02/15 12:20 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Movie());
        proxy.watch();
    }
}
