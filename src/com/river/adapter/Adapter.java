package com.river.adapter;

public class Adapter implements Cat, Dog {
    private Cat cat;
    private Dog dog;

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void catchMouse() {
        System.out.println("Cat:");
        cat.catchMouse();
    }

    @Override
    public void cry() {
        System.out.println("Cat:");
        dog.wang();
    }


    @Override
    public void wang() {
        System.out.println("Dog:");
        dog.wang();
    }

    @Override
    public void run() {
        System.out.println("Dog:");
        cat.catchMouse();
    }
}
