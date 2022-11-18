package com.river.adapter;

public class ConcreteDog implements Dog {

    @Override
    public void wang() {
        System.out.println("wang!!");
    }

    @Override
    public void run() {
        System.out.println("I am running");
    }

}
