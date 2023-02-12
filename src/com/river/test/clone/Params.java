package com.river.test.clone;

import java.io.Serializable;

/**
 * <p>Project: design-patterns - Params
 * <p>Powered by river On 2023/02/12 5:10 PM
 *
 * @author Riverify
 * @version 1.0
 * @since JDK17
 */
public class Params implements Serializable {
    private static final long serialVersionUID = 5526194094062874108L;
    private int age;

    private int height;

    public Params(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Params{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
