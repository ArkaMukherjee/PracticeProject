package com.decorator.pattern;

public class ChocolateIceCream  extends IcecreamDecorator{
    public  ChocolateIceCream(IceCream typeIceCream) {
        super(typeIceCream);
        System.out.println("Basic Ice Cream");
        System.out.println("Adding chocolate syrup");
    }
    public String getName() {
        return iceCream.getName()+ " Chocolate syrup ";
    }

    public Integer getPrice() {
        return iceCream.getPrice()+ 5;
    }

}
