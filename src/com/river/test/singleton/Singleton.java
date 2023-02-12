package com.river.test.singleton;

/**
 * <p>Project: design-patterns - Singleton
 * <p>Powered by river On 2023/02/11 7:10 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */

// 俄汉 单例模式
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("饿汉单例");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}

// 懒汉式
class Instance {
    private static Instance instance;

    private Instance() {
        System.out.println("懒汉单例");
    }

    public static Instance getInstance() {
        if (instance == null) {
            return instance = new Instance();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance1_1 = Singleton.getInstance();
        Instance instance2 = Instance.getInstance();
        Instance instance2_2 = Instance.getInstance();

    }

}
