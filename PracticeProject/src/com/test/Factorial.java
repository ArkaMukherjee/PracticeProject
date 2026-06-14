package com.test;

import javax.xml.soap.SOAPPart;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Factorial is : "+factorial(25));
    } 

    public static int factorial(int num) {
        System.out.println(num);
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
