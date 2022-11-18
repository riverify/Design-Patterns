package com.river.homework4;

public class LaptopBuilder extends ComputerBuilder {

        @Override
        public void buildCpu() {
            computer.setCpu("M1");
        }

        @Override
        public void buildRam() {
            computer.setRam("32G");
        }

        @Override
        public void buildHarddisk() {
            computer.setHarddisk("2T");
        }

        @Override
        public void buildMainframe() {
            computer.setMainframe("MacBook");
        }

        @Override
        public void buildMonitor() {
            computer.setMonitor("15.6寸");
        }

        @Override
        public Computer produceComputer() {
            return computer;
        }

}

