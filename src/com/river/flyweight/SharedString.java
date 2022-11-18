package com.river.flyweight;

import java.util.HashMap;

/**
 * @Author River
 * @Date 2022 11 10 17 17
 **/
public class SharedString {
    // 成员变量
    private String content; // 内容
    private Color color;    // 颜色
    private Size size;      // 字体大小


    /**
     * 无参构造方法
     */
    public SharedString() {}

    /**
     * 有参构造方法
     * @param content 内容
     */
    public SharedString(String content) {
        this.content = content;
    }

    /**
     * 设置颜色
     * @param color 颜色
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 设置字体大小
     * @param size 字体大小
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * 显示内容
     */
    public void show() {
        System.out.println("Content：" + content + "(Color：" + color.getColor() + " Font size：" + size.getSize() + ")");
    }
}
