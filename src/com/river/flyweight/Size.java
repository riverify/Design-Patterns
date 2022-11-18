package com.river.flyweight;

/**
 * @Author River
 * @Date 2022 11 10 17 15
 **/

/**
 * 字体大小类
 */
public class Size {
    // 字体大小
    private int size;

    // 构造方法
    public Size() {}

    public Size(int size) {
        this.size = size;
    }

    // 获取字体大小
    public int getSize() {
        return size;
    }
}

