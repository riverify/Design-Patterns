package com.river.appliances;

public abstract class Manufacturer {
    protected Appliance appliance;

    public abstract void produce();
    public abstract void assemble(Appliance appliance);
}
