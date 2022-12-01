package com.river.mediator;

/**
 * FileName: UnitedNations
 * Date: 2022/12/01
 * Time: 14:10
 * Author: river
 * <p>
 * 抽象中介类
 */
public abstract class UnitedNations {

    /**
     * 声明一个联合国成员方法
     *
     * @param message 需要发送的消息
     * @param country 发送消息的国家
     */
    public abstract void declare(String message, Country country);


}
