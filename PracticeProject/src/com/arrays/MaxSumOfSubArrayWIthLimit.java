package com.arrays;

public class MaxSumOfSubArrayWIthLimit {

    public static void main(String[] args) {

        int[] A={1,9,30,-5,20,7};
        //Naive solution
        process1(A,3);
        //Effective SOlition
       // process2(A,3);
    }

    private static void process2(int[] A, int k) {

        int len=A.length;
        int curr_sum=A[0]+A[1]+A[2];
        int max_sum=curr_sum;
        for(int i=1;i+k-1<len;i++)
        {

            curr_sum= curr_sum-A[i-1]+A[i+2];
            max_sum=Math.max(max_sum,curr_sum);
        }
        System.out.println(max_sum);
    }

    private static void process1(int[] a,int k) {

        int max_sum=0;
        int n=a.length;
        for(int i=0;i+k-1<n;i++)
        {
            int curr_sum=0;
            for(int j=i;j<i+k;j++)
            {
                curr_sum=curr_sum+a[j];
            }
            max_sum=Math.max(max_sum,curr_sum);
        }
        System.out.println(max_sum);
    }
}
