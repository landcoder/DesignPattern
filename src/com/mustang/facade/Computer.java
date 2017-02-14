package com.mustang.facade;

/**
 * Desc
 * Created by Mustang on 17/2/14.
 */
public class Computer {

    private CPU cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startUp() {
        System.out.println("computer start...");
        cpu.startUp();
        disk.startUp();
        memory.startUp();
        System.out.println("computer start complete");
    }

    public void shutDown() {
        System.out.println("computer shutdown...");
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
        System.out.println("computer shutdown complete...");
    }

}
