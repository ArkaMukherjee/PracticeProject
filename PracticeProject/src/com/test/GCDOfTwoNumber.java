package com.test;

import java.util.*;

public class GCDOfTwoNumber {
    public static void main(String[] args) {
        String s = "kkkk";
        int lengthOfstring = s.length();
        Set<String> setOfStrings = new HashSet<>();
        int countAnagrams = 0;
        for (int i = 0; i < lengthOfstring; i++) {
            for (int j = i + 1; j <= lengthOfstring; j++) {
                String str = s.substring(i, j);
                char[] strArray = str.toCharArray();
                Arrays.sort(strArray);
                String finalString=String.valueOf(strArray);
                if (setOfStrings.contains(finalString)) {
                    countAnagrams++;
                } else {
                    setOfStrings.add(finalString);
                }
            }
        }
        System.out.println(countAnagrams);
    }

    public  int gcdOfTwoNumber(int a, int b) {
        /*
        Recursive way
        ================
        if(a%b==0)
            return b;
        else
        {
            return gcdOfTwoNumber(b,a%b);
        }
        Complexity
        ===========


        */
        String s = "abba";
        int lengthOfstring = s.length();
        Set<char[]> setOfStrings = new HashSet<>();
        int countAnagrams = 0;
        for (int i = 0; i < lengthOfstring; i++) {
            for (int j = i + 1; j <= lengthOfstring; j++) {
                String str = s.substring(i, j);
                char[] strArray = str.toCharArray();
                Arrays.sort(strArray);
                if (setOfStrings.contains(strArray)) {
                    countAnagrams++;
                } else {
                    setOfStrings.add(strArray);
                }
            }
        }

        /*while(a%b!=0)
        {
            int temp=a;
            a=b;
            b=temp%b;

            List<Integer> l= new LinkedList<>();
        }
        return b;*/
        return 0;
    }
}
