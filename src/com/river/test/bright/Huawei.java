package com.river.test.bright;

/**
 * <p>Project: design-patterns - Huawei
 * <p>Powered by river On 2023/02/15 12:47 AM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Huawei implements Brand {
    @Override
    public void open() {
        System.out.println("加油Huawei,加油China");
    }

    @Override
    public void call() {
        System.out.println("你这是违法行为，走，跟我区自首");
    }

    @Override
    public void close() {
        System.out.println("本以为抓了小贼，每想到捅了了老窝");
    }
}
