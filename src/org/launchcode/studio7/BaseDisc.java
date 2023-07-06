package org.launchcode.studio7;

public class BaseDisc {
    private int totalCapacity;
    private int availableCapacity;
    private int usedCapacity;

    private String name;

    public BaseDisc(String name, int totalCapacity){
        this.name = name;
        this.totalCapacity = totalCapacity;
    }

}
