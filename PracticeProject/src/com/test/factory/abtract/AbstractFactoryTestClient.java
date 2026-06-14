package com.test.factory.abtract;

public class AbstractFactoryTestClient {

    public static void main(String arg[])
    {
        Computer laptop =ComputerFactory.getComputer(new LaptopFactory("Dell Laptop","8GB","1TB"));

        System.out.println(laptop);

        Computer desktop =ComputerFactory.getComputer(new DesktopFactory("Dell Desktop","8GB","1TB"));

        System.out.println(desktop);
    }
}
