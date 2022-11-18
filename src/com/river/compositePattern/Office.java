package com.river.compositePattern;

/**
 * @author River
 */
public class Office extends Unit {
    // 成员属性
    private String name;

    // 构造方法
    public Office() {}

    public Office(String name) {
        this.name=name;
    }

    /**
        处理成员属性的方法
     */
    @Override
    public void handleArchives() {
        System.out.println(name +" 收到了档案，开干开干！！！");
    }
}
