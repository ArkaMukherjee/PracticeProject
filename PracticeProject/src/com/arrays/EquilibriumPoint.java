package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class EquilibriumPoint {
    public static void main(String[] args) {
       long  a[] = {20, 17, 42, 25, 32, 32, 30, 32, 37, 9, 2, 33, 31, 17, 14, 40, 9, 12, 36, 21, 8, 33, 6, 6, 10, 37, 12, 26, 21, 3};
        System.out.println(equilibriumPoint(a,a.length));

        //System.out.println(sumValue(a,13));
    }

    private static long sumValue(long[] a,int limit)
    {
        long sum=0;
        int i=0;
        for(long l:a)
        {
            if(i<limit-1) {
                sum = sum + a[i];
                i++;
            }
        }
        return sum;
    }

    public static int equilibriumPoint(long arr[], int n) {

        long total_sum=0;
        for(int i=0;i<n;i++)
        {
            total_sum+=arr[i];
        }

        long left_sum=0;
        for(int i=0;i<n;i++)
        {
            if(left_sum==(total_sum-(left_sum+arr[i])))
            {
                return i;
            }
            else
            {
                left_sum=left_sum+arr[i];
            }
        }
        return -1;
    }
}
