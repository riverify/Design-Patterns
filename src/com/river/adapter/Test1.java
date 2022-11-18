package com.river.adapter;

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new ConcreteDog();
        Cat cat = new ConcreteCat();
        Adapter adapter = new Adapter();
        adapter.setCat(cat);
        adapter.setDog(dog);
        cat = adapter;
        dog = adapter;
        cat.catchMouse();
        cat.cry();
        dog.wang();
        dog.run();
    }

}
