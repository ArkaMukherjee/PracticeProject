package com.test;

public class BreakAndContinue {

    public static void main(String[] args) {

        //Test Break  & Continue statement
        //testBreakStatement();

        testContinueStatement();
    }

    private static void testContinueStatement() {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                {
                    continue;
                }
                System.out.println(i+" ------ "+j);
            }
        }

    }

    private static void testBreakStatement() {

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                {
                    break;
                }
                System.out.println(i+" ------ "+j);
            }
        }
    }
}
