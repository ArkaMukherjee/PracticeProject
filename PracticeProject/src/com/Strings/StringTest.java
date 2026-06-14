package com.Strings;

import java.util.Stack;

public class StringTest {
    public static void main(String[] args) {
        //Bruteforce
        System.out.println(longestPalindrome("babad"));
    }
        public static  String longestPalindrome(String s) {

            int max=0;
            String maxString=null;
            for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<=s.length();j++)
                {
                    String subs=s.substring(i,j);
                    if(checkPalindrome(subs) && subs.length()>max)
                    {
                        maxString=subs;
                        max=Math.max(max,subs.length());
                    }
                }
            }
            return maxString;
        }

        private static boolean checkPalindrome(String s)
        {
            Stack<Character> st= new Stack<>();
            char[] charArray= s.toCharArray();
            for(int k=0;k<charArray.length;k++)
            {
                st.push(charArray[k]);
            }

            StringBuilder sFinal= new StringBuilder();
            for(int l=0;l<s.length();l++)
            {
                sFinal.append(st.pop());
            }

            if(sFinal.toString().equals(s))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

}
