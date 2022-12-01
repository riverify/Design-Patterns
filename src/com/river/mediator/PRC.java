package com.river.mediator;

/**
 * FileName: PRC
 * Date: 2022/12/01
 * Time: 14:29
 * Author: river
 * <p>
 * 具体国家类 - 中国
 */
public class PRC extends Country {

    /**
     * 中国国家成员接收消息
     *
     * @param message 需要接收的消息
     */
    @Override
    public void getDeclare(String message) {
        System.out.println("中国获得对方消息：" + message);
    }
}
