package com.river.mediator;

/**
 * FileName: Country
 * Date: 2022/12/01
 * Time: 14:09
 * Author: river
 * <p>
 * 抽象国家类
 */
public abstract class Country {

    /**
     * 持有一个中介者对象
     */
    protected UnitedNations mediator;

    /**
     * UnitedNations对象的setter方法,所有的具体国家类都需要注册一个中介者对象
     *
     * @param mediator 具体的中介者对象，如WTO
     */
    public void setMediator(UnitedNations mediator) {
        this.mediator = mediator;
    }

    /**
     * 声明一个联合国国家成员方法 发送消息
     *
     * @param message 需要发送的消息
     */
    public void declare(String message) {
        mediator.declare(message, this);
    }

    /**
     * 声明一个联合国国家成员方法 接收消息
     *
     * @param message 需要接收的消息
     */
    public abstract void getDeclare(String message);

}
