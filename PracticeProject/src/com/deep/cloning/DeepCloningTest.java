package com.deep.cloning;


public class DeepCloningTest {
    public static void main(String arg[]) throws CloneNotSupportedException {
        Address addrs=new Address("Rabidrasarani","4d","48559599");
        Person p1= new Person("Arka Mukherjee",addrs);
        Person p2 = (Person) p1.clone();
        p1.getAddress().setRoad("Bipin bihari");
        System.out.println("Deep cloning print p1 name: "+p1.getAddress().getRoad());
        System.out.println("Deep cloning print p2 name: "+p2.getAddress().getRoad());
        System.out.println(p1 != p2);
    }
}
