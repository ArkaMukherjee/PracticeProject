package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr= {8,8,6,6,6,4,6};
        int len=arr.length;
        int max_count=0;
        int max_element=0;
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(hm.get(arr[i])!=null)
            {
                int count=hm.get(arr[i]);
                hm.put(arr[i],count+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> e : hm.entrySet())
        {
            if(e.getValue()>max_count)
            {
                max_count=e.getValue();
                max_element= e.getKey();
            }
        }

        if(max_count>len/2)
        {
            for(int i=0;i< arr.length;i++)
            {
                if(arr[i]==max_element)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
        else
        {
            System.out.println(-1);
        }
    }
}
