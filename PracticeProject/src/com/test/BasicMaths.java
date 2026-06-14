package com.test;

public class BasicMaths {

    public static void main(String[] args) {

        //digitCount();
        //palindromNumber();
        trailingZeroInFactorial();

    }

    private static void trailingZeroInFactorial() {


        int number=100;
        long result=1;
        for(int i=number;i>0;i--)
        {
            result=result*i;
        }

        int count=0;
        while(result>0)
        {
            if(result%10==0)
            {
                count++;
                result=result/10;
            }
            else
            {
                break;
            }
        }
        System.out.println(count);
    }

    private static void palindromNumber() {
        int number= 68986;
        int result=0;
        int remainder=0;
        int store=number;
        while(number>0)
        {
            remainder=number%10;
            result=result*10+remainder;
            number=number/10;
        }

        boolean isPalindrom=  store==result?true:false;
        System.out.println("Palindron :  "+isPalindrom);
    }



    public static void digitCount()
    {
        int number=6799;
        int count=0;
        while(number>0)
        {
            number=number/10;
            count++;
        }
        System.out.println(count);
    }

}
