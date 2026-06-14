package com.arrays;

public class CircularSubArrayMaxSum {
    public static void main(String[] args) {
        int[] arr= {5,-2,3,4};
        //Naive Solution
        process1(arr);
       // Effective Solution
        process2(arr);
    }

    private static void process2(int[] arr) {
    }

    private static void process1(int[] arr) {

        int n= arr.length;
        int max_sum=0;
        for(int i=0;i<n;i++)
        {
            int curr_sum=arr[i];
            int curr_max=arr[i];
            for(int j=1;j<n;j++)
            {
                curr_sum = curr_sum+arr[(i+j)%n];
                curr_max=Math.max(curr_sum,curr_max);
            }
            max_sum=Math.max(max_sum,curr_max);
        }
        System.out.println(max_sum);
    }
}
