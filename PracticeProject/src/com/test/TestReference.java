package com.test;

import com.shallow.cloning.Address;
import com.shallow.cloning.Person;

public class TestReference {

    public static void main(String arg[])
    {
        Address address= new Address("Test Road","Test Block","23456");
        Person p= new Person("Arka",address);

        testMethod(p);
        System.out.println(p.getAddress().getRoad());
    }

    private static void testMethod(Person p) {
        Address address=p.getAddress();
        address.setRoad("Natunpukur");
        System.out.println();
    }
}
