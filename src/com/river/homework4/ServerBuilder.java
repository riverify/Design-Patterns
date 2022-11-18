package com.river.homework4;

public class ServerBuilder extends ComputerBuilder {

    @Override
    public void buildCpu() {
        computer.setCpu("E5");
    }

    @Override
    public void buildRam() {
        computer.setRam("256G");
    }

    @Override
    public void buildHarddisk() {
        computer.setHarddisk("10T");
    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("Dell R730");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("No Monitor");
    }

    @Override
    public Computer produceComputer() {
        return computer;
    }

}
