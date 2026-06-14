package com.arrays;

import java.util.Stack;

public class MaxDiff {
    public static void main(String[] args) {
        int[] arr= {2,3,10,6,4,8,1};
        int maxDif=0;
        int min= arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int diff=arr[i]-min;
            min=Math.min(min,arr[i]);
            maxDif= Math.max(diff,maxDif);
        }

        //System.out.println(maxDif);

        arrayReverse(arr);

        for(int i: arr)
        {
            System.out.println(i);
        }
    }

    private static void arrayReverse(int[] arr) {

        Stack<Integer> st= new Stack<>();

        for(int i=0;i<arr.length;i++)
        {
            st.push(arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=st.pop();
        }

    }
}
