package com.test.factory.abtract;

public class Desktop implements Computer {

    private String modelName;
    private String ramSize;
    private String hdd;

    public Desktop(String modelName, String ramSize, String hdd) {
        this.modelName = modelName;
        this.ramSize = ramSize;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return ramSize;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getModel() {
        return modelName;
    }


    @Override
    public String toString() {
        return "Desktop{" +
                "modelName='" + modelName + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
