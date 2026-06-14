package com.test;

public class TestClass {

    public static void main(String[] args) {
        System.out.println(Math.pow(2,31));
        int number=2345674;
        int reverse=0;
        while(number>0) {
            int carry = number % 10;
            number = number / 10;
            reverse= reverse*10 + carry;
        }

       System.out.println(reverse);
    }
}
