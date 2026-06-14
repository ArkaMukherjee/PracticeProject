package com.test;

import java.util.*;

public class BreakTest {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 0, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            System.out.println(arr[i]);
        }
        PriorityQueue q= new PriorityQueue();
        Arrays.sort(arr);
        Collections.sort(new ArrayList<Integer>()) ;
    }
}
