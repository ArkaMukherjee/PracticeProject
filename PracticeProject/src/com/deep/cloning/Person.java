package com.deep.cloning;

import javax.swing.plaf.DesktopPaneUI;

public class Person implements Cloneable{
     String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedPerson=(Person) super.clone();
        clonedPerson.setAddress((Address) clonedPerson.getAddress().clone());
        return clonedPerson;
    }
}
