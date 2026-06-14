package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequenceOfThree {

    public static void main(String[] args) {

        List<Integer> source = Arrays.asList( 1, 1, 3);

        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) > first) {


                third = second;
                second = first;
                first = source.get(i);
            }
        }

        if (first > second && second > third) {
            System.out.println(1);
        } else
            System.out.println(0);
    }
}

