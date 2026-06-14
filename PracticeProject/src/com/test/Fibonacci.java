package com.test;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class Fibonacci {

    public static void main(String arg[])
    {
       // fiboUsingIterative(8);
        Fibonacci fibonacci= new Fibonacci();
        System.out.println(fibonacci.fiboRecursive(8));
    }

    public static void fiboUsingIterative(int number)
    {
        int a=0;
        int b=1;

        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=number;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }

    public  int fiboRecursive(int n)
    {
        if (n <= 1) {
            return n;
        }
        return fiboRecursive(n-1) + fiboRecursive(n-2);

    }
}
