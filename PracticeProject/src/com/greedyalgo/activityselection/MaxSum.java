package com.greedyalgo.activityselection;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr= {-469, -8, -358, -278, -214 ,-436, 400, -313};
        findMaxAverage(arr,8,7);
    }

    public static int findMaxAverage(int[] arr, int n, int k) {
        int start = 0;
        int pointer = 0;
        int max = 0;
        while ((start + k) < n) {
            int sum = 0;
            for (int i = start; i < start + k; i++) {
                sum = sum + arr[i];
            }
            if (max==0||sum > max) {
                pointer = start;
                max = sum;
            }
            start++;
        }
        return pointer;
    }
}
