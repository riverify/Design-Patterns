package com.river.mediator;

/**
 * FileName: USA
 * Date: 2022/12/01
 * Time: 14:35
 * Author: river
 * <p>
 * 具体国家类 - 美国
 */
public class USA extends Country {
    @Override
    public void getDeclare(String message) {
        System.out.println("美国获得对方消息：" + message);
    }
}
