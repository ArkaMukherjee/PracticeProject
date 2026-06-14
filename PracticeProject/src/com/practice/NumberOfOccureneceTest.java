package com.practice;

import java.util.*;

public class NumberOfOccureneceTest {
    public static void main(String[] args) {
/*        int[] elements = new int[]{0,0,0,0,0,0};
        int maxOccurrences = 0;
        Map<Integer, Integer> numberMap = new HashMap<>();
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            int number = elements[i];
            Integer numberCountValue = numberMap.get(number);
            if (numberCountValue != null) {
                if (numberCountValue < maxOccurrences) {
                    finalList.add(number);
                    numberMap.put(number, ++numberCountValue);
                }
            } else {
                if (number != 0) {
                    numberMap.put(number, 1);
                    finalList.add(number);
                }
            }
        }
        for (int i : finalList.stream().mapToInt(i -> i.intValue()).toArray()) {
            System.out.println(i);
        }
        */
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);

        for (int i :arr)
        {
            System.out.println(i);
        }

        Set s = new HashSet<Integer>();
        s.add(3);
        s.add(11);
        s.add(9);
        s.add(null);
        System.out.println(s);


        List l = new LinkedList<Integer>();

    }
}
