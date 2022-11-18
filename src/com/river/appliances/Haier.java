package com.river.appliances;

public class Haier extends Manufacturer {
    @Override
    public void produce() {
        System.out.print("Haier is producing");
    }

    @Override
    public void assemble(Appliance appliance) {
        this.appliance = appliance;
        appliance.assemble();
    }
}

