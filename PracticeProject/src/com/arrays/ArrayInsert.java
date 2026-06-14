package com.arrays;

public class ArrayInsert {

    public static void main(String[] args) {
        int[] a = new int[6];
        a[0]=2;
        a[1]=5;
        a[2]=4;a[3]=6;a[4]=3;

        int position = 2;
        int len=a.length;
        for(int i=4; i>=position;i--)
        {
            a[i+1]=a[i];
        }
        a[position]=8;

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
