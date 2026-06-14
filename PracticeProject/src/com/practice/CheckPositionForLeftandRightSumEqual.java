package com.practice;

public class CheckPositionForLeftandRightSumEqual {

    public static void main(String[] args) {

        int[] arr = new int[]{20,10,-80,10,10,15,35};
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int k = i;
            int leftSumOfposition = 0;
            int rightSumOfposition = 0;
            while (j > -1) {
                leftSumOfposition = leftSumOfposition + arr[j];
                j--;
            }
            while (k < arr.length) {
                rightSumOfposition = rightSumOfposition + arr[k];
                k++;
            }

            if (leftSumOfposition == rightSumOfposition) {
                System.out.println("Value of i " + i);
            }
        }
    }
}
