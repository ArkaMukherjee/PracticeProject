package com.arrays;

import java.sql.SQLOutput;

public class MaxOneInArrayCOunt {
    public static void main(String[] args) {

        int[] A={0,1,1,0,1,0};
        //naive Solution
       // System.out.println(count1(A));
        //Effective
        System.out.println(count2(A));
    }

    private static int count2(int[] A) {
        int n=A.length;
        int max_count=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(A[i]==1)
            {
                count++;
                max_count=Math.max(max_count,count);
            }
            else
            {
                count=0;
            }

        }
        return max_count;
    }

    private static int count1(int[] A) {

        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int temp=0;
            for(int j=i;j<n;j++)
            {

                if(A[j]==1)
                {
                    temp++;
                }
                else
                {

                    break;
                }
            }
            count=Math.max(count,temp);
        }

        return count;
    }
}
