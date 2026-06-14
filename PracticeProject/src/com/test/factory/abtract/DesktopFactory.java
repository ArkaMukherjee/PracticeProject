package com.test.factory.abtract;

public class DesktopFactory implements ComputerAbstractFactory {

    private String modelName;
    private String ramSize;
    private String hdd;

    @Override
    public Computer createComputer() {
        return new Desktop(modelName, ramSize, hdd);
    }

    public DesktopFactory(String modelName, String ramSize, String hdd) {
        this.modelName = modelName;
        this.ramSize = ramSize;
        this.hdd = hdd;
    }
}
