package com.river.adapter;

public class ConcreteCat implements Cat {

    @Override
    public void catchMouse() {
        System.out.println("I am catching mouse");
    }

    @Override
    public void cry() {
        System.out.println("I am crying");
    }

}
