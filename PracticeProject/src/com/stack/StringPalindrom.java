package com.stack;

import java.util.ArrayList;
import java.util.Stack;

public class StringPalindrom {

    public static void main(String[] args) {
        StringPalindrom s = new StringPalindrom();
        s.checkPalindrom("s34gg43s");
    }

    private void checkPalindrom(String s) {
        Stack s1 = new Stack<Character>();
        char[] charArray = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder(s.length());
        StringBuilder sbTwo = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                s1.push(charArray[i]);
                sb.append(charArray[i]);
            }
        }
        while (!s1.isEmpty()) {
            sbTwo.append(s1.pop());
        }

        if (sb.toString().equals(sbTwo.toString())) {
            System.out.println("String is plaindrom");
        } else {
            System.out.println("String is not plaindrom");
        }
    }
}
