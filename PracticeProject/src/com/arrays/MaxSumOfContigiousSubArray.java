package com.arrays;

import java.sql.SQLOutput;

public class MaxSumOfContigiousSubArray {

    public static void main(String[] args) {

        int[] arr= {2,3,-8,7,-1,2,3};
        //BruteForce
        //printByIteration(arr);
        //printByRecursion(arr);

        //Kadan's Algorithm
        sumByKadans(arr);
        System.out.println();
    }

    private static void sumByKadans(int[] a) {

        int max=a[0];
        int cont_max=0;
        for(int i=0;i<a.length;i++)
        {
            cont_max=Math.max(a[i],cont_max+a[i]);

            /*if(cont_max<0)
            {
                cont_max=0;
            }*/
            max= Math.max(cont_max,max);
        }

        System.out.println( "Max sum is "+ max);
    }

    private static void printByRecursion(int[] arr,int start,int end) {

        //if()
    }

    private static void printByIteration(int[] arr) {

        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                System.out.println("\n");
                int cur_sum=0;
                for(int k=i;k<=j;k++)
                {

                    cur_sum+=arr[k];
                    sum=Math.max(sum,cur_sum);

                    System.out.println(arr[k]+", ------ sum is :"+cur_sum);
                }
            }
        }
        System.out.println("Max sum is "+ sum);
    }
}