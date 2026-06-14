package com.test.circulararray;

public class TestCheck {

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
        int k=3;
        int arraySize= nums.length;
        int[] outArray= new int[arraySize];
        for(int i=(arraySize-k),j=0;i<=(arraySize+k) && j<arraySize;i++,j++)
        {
            // la.add(nums[(i % arraySize)]);
            outArray[j]=nums[(i % arraySize)];
            // System.out.print(la.toArray(new Integer[arraySize]));
        }
    }
}
