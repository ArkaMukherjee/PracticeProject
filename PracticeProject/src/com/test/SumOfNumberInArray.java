package com.test;

public class SumOfNumberInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{-2,0, 1, 2, 4,4,8,9,10};
        int sum = 8;
        int counter = 0;
        for (int i = 0, j =(arr.length - 1); i < arr.length && j > -1; ) {
            int valueSum = arr[i] + arr[j];
            if (valueSum == sum) {
                counter++;
                i++;
                j--;
            } else if (valueSum > sum) {
                j--;
            } else {
                i++;
            }
            if (j - i < 1) {
                break;
            }
        }
        System.out.println("Number of sum "+counter);
    }
}
