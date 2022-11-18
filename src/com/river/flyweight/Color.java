package com.river.flyweight;

/**
 * @Author River
 * @Date 2022 11 10 17 13
 **/

/**
 * 颜色类
 */
public class Color {
    // 颜色名称
    private String color;

    // 构造方法
    public Color() {}

    public Color(String color) {
        this.color = color;
    }

    // 获取颜色名称
    public String getColor() {
        return color;
    }

}
