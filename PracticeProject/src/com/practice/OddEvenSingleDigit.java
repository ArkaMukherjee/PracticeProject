package com.practice;

import java.util.*;
import java.util.stream.IntStream;

public class OddEvenSingleDigit {

    public static void main(String[] args) {

        int[] integers = new int[]{160, 3, 1719, 19, 11, 13, -21};
       /* Map<String, List<Integer>> map = new HashMap<>();
        map.put("odd", new ArrayList<>());
        map.put("even", new ArrayList<>());
        for (int i = 0; i < integers.length; i++) {

                if (integers[i] % 2 != 0) {
                    List<Integer> oddlist = map.get("odd");
                    oddlist.add(integers[i]);
                    map.put("odd", oddlist);
                }
                else {
                    List<Integer> evenlist = map.get("even");
                    evenlist.add(integers[i]);
                    map.put("even", evenlist);
                }
            }
            if (map.get("odd").size() > 1 && map.get("even").size() == 1) {
                System.out.println(map.get("even").get(0));
            } else if (map.get("even").size() > 1 && map.get("odd").size() == 1) {
                System.out.println(map.get("odd").get(0));
            }
        }*/


        // Best practice

        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        System.out.println(Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt());


        int[] elements = new int[]{20,37,20,21};


        System.out.println(IntStream.of(1, 2, 3, 4)
                .filter(e -> e > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(e -> e * e)
                .peek(e -> System.out.println("Mapped value: " + e))
                .sum());

        Map<Integer,Integer> numberMap= new HashMap<>();
        numberMap.keySet().stream().mapToInt(i->i.intValue()).toArray();
    }
}
