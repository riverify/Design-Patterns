package com.river.homework4;

public class Computer {
    private String cpu;
    private String ram;
    private String harddisk;
    private String mainframe;
    private String monitor;
    
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getHarddisk() {
        return harddisk;
    }
    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }
    public String getMainframe() {
        return mainframe;
    }
    public void setMainframe(String mainframe) {
        this.mainframe = mainframe;
    }
    public String getMonitor() {
        return monitor;
    }
    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
    
    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", harddisk=" + harddisk + ", mainframe=" + mainframe + ", monitor="
                + monitor + "]";
    }
    
}
