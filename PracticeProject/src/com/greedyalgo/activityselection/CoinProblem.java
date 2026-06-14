package com.greedyalgo.activityselection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinProblem {

    public static void main(String[] args) {
        Integer[] a= {5,10,2,1};
        List<Integer> b=getCoins(a,51);

        b.stream().forEach(value-> System.out.println(value));
    }

    private static List<Integer> getCoins(Integer[] a, int x)
    {
        Arrays.sort(a, Collections.reverseOrder());
        List<Integer> b=new ArrayList<>();
        int result=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=x)
            {
                int div= (int)Math.floor(x/a[i]);
                result=result+div;
                b.add(a[i]);
                x=x%a[i];
            }

            if(x==0)
            {
                break;
            }
        }
        return b;
    }
}
