package com.river.proxy;

/**
 * @Author River
 * @Date 2022/11/10 17:45
 **/
public class Client {
    public static void main(String[] args) {
        Subject subject = new Picture();
        subject.run();
    }
}