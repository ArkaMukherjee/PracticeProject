package com.arrays;

public class ArrayNumberOfPairs {

    public static void main(String arg[]) {
        Integer[] a = {2, 4, -2, 3, 1, 0, -4,2,-2,2};
        int counter=0;
        for(int i =0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==0)
                {
                    counter=counter+1;
                }
            }
        }
        System.out.println(counter);
    }
}