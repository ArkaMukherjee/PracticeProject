package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestA {

     public ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> outList = new ArrayList<>(k);
        for(int i=0;i<=n;i++)
        {
                int l=i+k;
                Set<Integer> s = new HashSet<Integer>();
                if(l<=n) {
                    for (int m = i; m < l; m++) {
                        s.add(A[m]);
                    }
                }
                outList.add(s.size());
        }
        return outList;
    }

    public static void main(String[] args) {
        /*int N = 7, K = 4;
        int A[] = {1,2,1,3,4,2,3};
        TestA t= new TestA();
        System.out.println(t.countDistinct(A,N,K));*/
        System.out.println("Hello World");
        //testPalindrom();

        testMethod();
    }

    private static void testMethod() {

         Integer[] arr = {2,3,4,5,6,7};
        int sum =Arrays.asList(arr).stream().reduce(0,(e1,e2)-> e1+e2);
        System.out.println(sum);
    }
}
