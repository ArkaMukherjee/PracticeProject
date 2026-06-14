package com.test.factory.abtract;

public class LaptopFactory implements ComputerAbstractFactory {

    private String modelName;
    private String ramSize;
    private String hdd;


    @Override
    public Computer createComputer() {
        return new Laptop(modelName, ramSize, hdd);
    }

    public LaptopFactory(String modelName, String ramSize, String hdd) {
        this.modelName = modelName;
        this.ramSize = ramSize;
        this.hdd = hdd;
    }
}
