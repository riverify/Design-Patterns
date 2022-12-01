package com.river.mediator;

/**
 * FileName: JP
 * Date: 2022/12/01
 * Time: 15:25
 * Author: river
 * <p>
 * 具体国家类 - 日本
 */
public class JP extends Country {

    /**
     * 日本国家成员接收消息
     *
     * @param message 需要接收的消息
     */
    @Override
    public void getDeclare(String message) {
        System.out.println("日本获得对方消息：" + message);
    }
}
