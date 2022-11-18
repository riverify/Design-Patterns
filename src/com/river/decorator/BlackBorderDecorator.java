package com.river.decorator;

/**
 * @Author River
 * @Date 2022 10 21 15 58
 **/
public class BlackBorderDecorator extends Decorator {

    /**
     * 有参构造
     *
     * @param component
     */
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    /**
     * 设置黑色边框
     */
    @Override
    public void display() {
        System.out.println("设置黑色边框");
        super.display();
    }
}

