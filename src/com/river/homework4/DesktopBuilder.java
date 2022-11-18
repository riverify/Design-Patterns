package com.river.homework4;

public class DesktopBuilder extends ComputerBuilder {

    @Override
    public void buildCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void buildRam() {
        computer.setRam("16G");
    }

    @Override
    public void buildHarddisk() {
        computer.setHarddisk("1T");
    }

    @Override
    public void buildMainframe() {
        computer.setMainframe("华硕 迫击炮");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("24寸 4K 200HZ");
    }

    @Override
    public Computer produceComputer() {
        return computer;
    }

}

