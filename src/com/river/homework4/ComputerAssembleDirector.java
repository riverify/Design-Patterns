package com.river.homework4;

public class ComputerAssembleDirector {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer assemble() {
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildHarddisk();
        computerBuilder.buildMainframe();
        computerBuilder.buildMonitor();
        return computerBuilder.produceComputer();
    }
}
