package com.test;

public class VallyStepsProblem {

    public static void main(String[] args) {
        int[] c = new int[]{0, 0, 1, 0, 0, 1, 0};
        int numberOfJump = 0;
        int i = 0;
        int lengthOfArray = c.length;
        while (i < lengthOfArray) {
            if ((i + 2) < lengthOfArray && c[i + 2] != 1) {
                i = i + 2;
                numberOfJump++;
            } else {
                if (i + 1 < lengthOfArray) {
                    numberOfJump++;
                }
                i = i + 1;
            }
        }
        System.out.println(numberOfJump);
    }
}

