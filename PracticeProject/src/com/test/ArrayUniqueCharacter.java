package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayUniqueCharacter {

    public static void main(String[] args) {
        /*System.out.println(firstUniqueChar("leetcode"
        ));*/

        int[] a= {3,5,91,0};
        Arrays.sort(a);
        for(int i:a)
        {
            System.out.println(i);
        }
    }

    public  static int firstUniqueChar(String s) {

        Map<Character, Integer> mapOfCharacter= new HashMap<>();

        char[] charArray= s.toCharArray();

        for(int i=0;i<charArray.length;i++)
        {
            if(mapOfCharacter.containsKey(charArray[i]))
            {
                mapOfCharacter.put(charArray[i], mapOfCharacter.get(charArray[i])+1);
            }
            else
            {
                mapOfCharacter.put(charArray[i],1);
            }
        }

        Integer index=-1;

        for(Map.Entry<Character, Integer> e : mapOfCharacter.entrySet())
        {
            if(e.getValue()==1)
            {
                return Arrays.asList(charArray).indexOf(e.getKey());
            }
        }

        return index;


    }
}
