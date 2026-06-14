package com.test;

public class TrailingZeroInFactorialOfNumber {

    public static void main(String[] args) {
        int n = 713;
        int counter = 0;
       // for (int i = 5; n / i >= 1;i*=5) {
        for (int i = 5; n / i >= 1;) {
            n=n/i;
            counter=counter+n;
           /* counter = counter + n / i;*/
            System.out.println("value of n is " + n);
        }
        System.out.println("Total number of trailing zeros in factorial of " + n + " is : " + counter);
    }
}
