package com.river.decorator;

/**
 * @Author River
 * @Date 2022 10 21 15 52
 **/
public class ScrollBarDecorator extends Decorator {

    /**
     * 有参构造
     *
     * @param component
     */
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    /**
     * 设置滚动条
     */
    @Override
    public void display() {
        System.out.println("设置滚动条");
        super.display();
    }

}
