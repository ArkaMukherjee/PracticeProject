package com.test.factory.abtract;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory caf){
        return caf.createComputer();
    }

}
