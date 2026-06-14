package com.test;

import java.util.ArrayList;
import java.util.List;

public class SmilyTest {

    public static void main(String[] args) {
        int count=0;
        List<String> arr = new ArrayList<String>();
        arr.add(":)"); arr.add(":D"); arr.add(":-}"); arr.add(":-()");
        for(String s:arr)
        {
            if(s.equals(":)")||s.equals(":D")||s.equals(";-D")||s.equals(":~)"))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
