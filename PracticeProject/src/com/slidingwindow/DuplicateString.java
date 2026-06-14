package com.slidingwindow;

import java.util.*;

public class DuplicateString {

    public static void main(String[] args) {
        String s="AAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s));

    }

    private static List<String> findRepeatedDnaSequences(String s) {

        /*int start=0;
        int end=0;
        Set<String> result= new HashSet<>();
        Map<String,Integer> wordCount= new HashMap<>();
        while(end<s.length())
        {
            if((end-start)<10)
            {
                end++;
            }
            else
            {
                if(wordCount.get(s.substring(start,end))!=null)
                {
                    result.add(s.substring(start,end));

                }
                else
                {
                    wordCount.put(s.substring(start,end),1);
                }
                start++;
            }
        }
        return new ArrayList<>(result);*/
        Set seen = new HashSet(), repeated = new HashSet();
        for (int i = 0; i + 9 < s.length(); i++) {
            String ten = s.substring(i, i + 10);
            if (!seen.add(ten))
                repeated.add(ten);
        }
        return new ArrayList(repeated);
    }
}

