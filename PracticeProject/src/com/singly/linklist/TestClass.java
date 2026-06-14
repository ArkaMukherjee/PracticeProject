package com.singly.linklist;

import java.io.*;

public class TestClass {


    public static void main(String[] args) {

    }

    private static boolean checkPalindrom(String s, int start,int end)
    {
        if(start==end)
        {
            return true;
        }
        return s.charAt(start) == s.charAt(end) &&  checkPalindrom(s, start+1,end-1);
    }

    public static String getNumber(int number) {
        int sum=0;
        String s="";
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
            {
                System .out.println(i);
                sum=sum+i;
            }
        }

        if(sum>number)
        {
            return "Abundant";
        }
        else if(sum<number)
        {
            return "Deficient";
        }
        else
        {
            return "Perfect";
        }


    }

   /* public static void main(String[] args) throws IOException {
        System .out.println(getNumber(28));
    }*/
}
