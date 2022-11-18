package com.river.appliances;

public class Hisense extends Manufacturer {
    @Override
    public void produce() {
        System.out.print("Hisense is producing");
    }

    @Override
    public void assemble(Appliance appliance) {
        this.appliance = appliance;
        appliance.assemble();
    }
}
