package com.river.appliances;

public class Test1 {
    public static void main(String[] args) {
        // Haier
        Haier haier = new Haier();
        haier.produce();
        System.out.print(" ");
        haier.assemble(new Refrigerator());
        System.out.print(", ");
        haier.assemble(new AirConditioner());
        System.out.print(", ");
        haier.assemble(new Televiosn());
        System.out.println(".");
        // Hisense
        Hisense hisense = new Hisense();
        hisense.produce();
        System.out.print(" ");
        hisense.assemble(new Refrigerator());
        System.out.print(", ");
        hisense.assemble(new AirConditioner());
        System.out.print(", ");
        hisense.assemble(new Televiosn());
        System.out.println(".");
        // TCL
        TCL tcl = new TCL();
        tcl.produce();
        System.out.print(" ");
        tcl.assemble(new Refrigerator());
        System.out.print(", ");
        tcl.assemble(new AirConditioner());
        System.out.print(", ");
        tcl.assemble(new Televiosn());
        System.out.println(".");


    }
}
