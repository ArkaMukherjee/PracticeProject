package com.decorator.pattern;

public class PlainIceCream implements IceCream {
    @Override
    public String getName() {
        return "Plain IceCream";
    }

    @Override
    public Integer getPrice() {
        return 10;
    }
}
