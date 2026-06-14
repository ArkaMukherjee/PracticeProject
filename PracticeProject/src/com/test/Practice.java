package com.test;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int N = 7, K = 4;
        int A[] = {1,2,1,3,4,2,3};
        countDistinct(A,N,K);
    }

    public  static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> outList = new ArrayList<>();
        int i=0;
        int j=i+3;

        while(j<n)
        {
            Set<Integer> s= new HashSet<Integer>();
            for( ;i<=j;i++)
            {
                s.add(A[i]);
            }
            outList.add(s.size());
            i=i+1;
        }
        return outList;
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int i=0;
        int counter =0;
        while(i<s.size())
        {
            int sum=0;
            int length=0;
            for(int j=i;j<s.size();j++)
            {
                if(length<m)
                {
                    sum=sum+s.get(j);

                }
                length=length+1;
            }
            if(sum==d)
            {
                counter++;

            }
            i++;
        }
        return counter;
    }
}
