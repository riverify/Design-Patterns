package com.river.homework4;

public class Test1 {
    public static void main(String[] args) {
        ComputerAssembleDirector director = new ComputerAssembleDirector();
        // laptop
        director.setComputerBuilder(new LaptopBuilder());
        Computer computer = director.assemble();
        System.out.println(computer);
        // desktop
        director.setComputerBuilder(new DesktopBuilder());
        computer = director.assemble();
        System.out.println(computer);
        // server
        director.setComputerBuilder(new ServerBuilder());
        computer = director.assemble();
        System.out.println(computer);
    }
}
