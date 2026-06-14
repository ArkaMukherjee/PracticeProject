package com.decorator.pattern;

import java.sql.SQLOutput;

public class TestDecorator {

    public static void main( String arg[])
    {
        IceCream preparedIceCream= new Nuts(new ChocolateIceCream(new PlainIceCream()));
        System.out.println(preparedIceCream.getName());
        System.out.println(preparedIceCream.getPrice());
    }
}
