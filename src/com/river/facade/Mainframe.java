package com.river.facade;

/**
 * @Author River
 * @Date 2022 11 10 17 04
 **/
public class Mainframe {
    /**
     * 硬盘
     */
    private HardDisk hardDisk;
    /**
     * CPU
     */
    private CPU cpu;
    /**
     * 内存
     */
    private Memory memory;
    /**
     * 操作系统
     */
    private OS os;

    /**
     * 构造方法
     */
    public Mainframe() {
        hardDisk = new HardDisk();
        cpu = new CPU();
        memory = new Memory();
        os = new OS();
    }

    /**
     * 启动方法
     */
    public void on() {
        System.out.println("start mainframe...");
        try {
            hardDisk.read();
            cpu.run();
            memory.check();
            os.load();
        } catch (Exception e) {
            System.err.println("mainframe start failed!");
        }
        System.out.println("mainframe start successfully!");
    }
}
