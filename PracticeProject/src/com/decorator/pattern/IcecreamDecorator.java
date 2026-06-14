package com.decorator.pattern;

public abstract class  IcecreamDecorator  implements IceCream{
    protected IceCream iceCream;
    public IcecreamDecorator(IceCream typeIceCream)
    {
        iceCream=typeIceCream;
    }

    public String getName() {
        return iceCream.getName();
    }

    public Integer getPrice() {
        return iceCream.getPrice();
    }
}
