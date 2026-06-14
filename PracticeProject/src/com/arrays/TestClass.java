package com.arrays;

import com.test.GCDOfTwoNumber;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    public static void main(String[] args) {

        String first="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String second="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        System.out.println(canConstruct(first,second));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> source= new HashMap<>();
        boolean isPossible=true;

        Map<Character, Integer> target= new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            if(source.get(magazine.charAt(i))!=null)
            {
                int temp= source.get(magazine.charAt(i));
                source.put(magazine.charAt(i),temp+1);
            }
            else
            {
                source.put(magazine.charAt(i),1);
            }
        }

        for(int i=0;i<ransomNote.length();i++)
        {
            if(target.get(ransomNote.charAt(i))!=null)
            {
                int temp= target.get(ransomNote.charAt(i));
                target.put(ransomNote.charAt(i),temp+1);
            }
            else
            {
                target.put(ransomNote.charAt(i),1);
            }
        }

        for(Map.Entry<Character, Integer> mp: target.entrySet())
        {
            if(!(source.get(mp.getKey())!=null && (source.get(mp.getKey()) .equals(mp.getValue()) || source.get(mp.getKey())> mp.getValue())))
            {
                isPossible=false;
            }
        }

        return isPossible;
    }
}
