package com.decorator.pattern;

public class Nuts  extends IcecreamDecorator{
    public Nuts(IceCream typeIceCream) {
        super(typeIceCream);
        System.out.println("Adding Nuts");

    }

    public String getName() {
        return iceCream.getName()+ " Nuts ";
    }

    public Integer getPrice() {
        return iceCream.getPrice()+ 3;
    }
}
