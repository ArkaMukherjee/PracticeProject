package com.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BitCounter {

    public static void main(String[] args) {
        /*int counter = 0;
        int n = 100;*/
   /* if(n==0||n==1)
    {
      return n;
    }
    if(n%2==1)
    {
      counter=1+countBits(n/2);
    }
    else
    {
      counter=0+countBits(n/2);
    }
    return counter;*/
        /*int num=21445;
        int[] arr= new int[String.valueOf(num).length()];
        int i=0;
        StringBuilder s=new StringBuilder();
        while(num>0)
        {
            arr[i++]=num%10;
            num=num/10;
        }
        java.util.Arrays.sort(arr);
        for(int j=0;j<arr.length ;j++)
        {
            s.append(arr[j]);
        }
        System.out.println(Integer.parseInt(s.reverse().toString()));
*/
        int n =9119;
       /* String s="";
        Arrays.asList(String.valueOf(n).split(""))
                .stream().mapToInt(Integer::parseInt).map(i->i*i).mapToObj(intValue -> Integer.toString(intValue))
                .collect(Collectors.joining());
        for(int j:arr)
        {
            s=s+j;
        }*/
        System.out.println(Integer.parseInt(Arrays.asList(String.valueOf(n).split(""))
                .stream().mapToInt(Integer::parseInt).map(i->i*i).mapToObj(intValue -> Integer.toString(intValue))
                .collect(Collectors.joining())));

    }

}
