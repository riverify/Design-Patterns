package com.river.decorator;

/**
 * @Author River
 * @Date 2022 10 21 15 39
 **/

/**
 * 抽象装饰类
 */
public class Decorator extends Component {

    private Component component;

    /**
     * 有参构造
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
