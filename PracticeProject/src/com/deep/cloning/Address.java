package com.deep.cloning;

public class Address implements Cloneable{
    private String road;
    private String block;
    private String pin;

    public Address(String road, String block, String pin) {
        this.road = road;
        this.block = block;
        this.pin = pin;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getRoad() {
        return road;
    }

    public String getBlock() {
        return block;
    }

    public String getPin() {
        return pin;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
