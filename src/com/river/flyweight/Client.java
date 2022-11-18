package com.river.flyweight;

/**
 * @Author River
 * @Date 2022 11 10 17 34
 **/
public class Client {
    public static void main(String[] args) {
        // 创建享元工厂
        SharedStringFactory factory = new SharedStringFactory();
        // 创建共享对象
        SharedString sharedString1 = factory.getSharedString("Hello");
        SharedString sharedString2 = factory.getSharedString("World");
        SharedString sharedString3 = factory.getSharedString("Hello");
        // 设置颜色
        sharedString1.setColor(new Color("Red"));
        sharedString2.setColor(new Color("Green"));
        sharedString3.setColor(new Color("Green"));
        // 设置字体大小
        sharedString1.setSize(new Size(12));
        sharedString2.setSize(new Size(14));
        sharedString3.setSize(new Size(16));
        // 显示内容
        sharedString1.show();
        sharedString2.show();
        sharedString3.show();
        // 对比三个对象
        System.out.println("sharedString1 == sharedString2 ? " + (sharedString1 == sharedString2));
        System.out.println("sharedString1 == sharedString3 ? " + (sharedString1 == sharedString3));
    }
}
