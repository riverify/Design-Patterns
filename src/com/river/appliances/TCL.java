package com.river.appliances;

public class TCL extends Manufacturer {
    @Override
    public void produce() {
        System.out.print("TCL is producing");
    }

    @Override
    public void assemble(Appliance appliance) {
        this.appliance = appliance;
        appliance.assemble();
    }
}
