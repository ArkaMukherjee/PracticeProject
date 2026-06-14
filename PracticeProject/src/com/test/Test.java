package com.test;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import org.omg.CORBA.INTERNAL;

import javax.xml.soap.SOAPPart;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd","abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {

        int start=0,end=0;
        List<Integer> result= new ArrayList<>();
        Set<Character> anagramSet=new HashSet<>();
        while(end<s.length())
        {
            if(p.indexOf(s.charAt(end))!=-1 && (end-start)<3)
            {
                anagramSet.add(s.charAt(end));
                end++;
            }
            else
            {
                start++;
                end=start;
            }
            if(anagramSet.size()==p.length())
            {
                result.add(start);
                start++;
                end=start;
                anagramSet.clear();
            }
        }
        return result;
    }
 /*   public static void main(String[] args) {

        String s =
    }*/

 /*   public static int minimumMoves(String s, int d) {

       int startIndex = 0;
        int counter = 0;
        String sFinal=s.trim();
        while (startIndex < sFinal.length()) {
            String sub = (sFinal.length() - startIndex) >= d ? sFinal.substring(startIndex, startIndex + d) : sFinal.substring(startIndex);
            if (!sub.contains("1")) {
                counter++;
            }
            startIndex = startIndex + d;
        }
        return counter;
    }*/


    public static int zeros(int n) {
        // your beatiful code here
        int counter=0;
        long factorialValue=factorial(n);
        while(factorialValue%10==0)
        {
            counter++;
            factorialValue=factorialValue/10;

        }
        return counter;
    }

    public static long factorial(int n)
    {
        long factorialValue=1l;
        for (int j=n;j>0;j--)
        {
            factorialValue=factorialValue*j;
        }
        return factorialValue;
    }

}
