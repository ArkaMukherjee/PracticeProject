package com.arrays;

public class SticklerTheif {

    public static void main(String[] args) {
       int  a[] = {5,5,10,100,10,5};
        System.out.println(findMaxSum(a,a.length));
    }

    public static int findMaxSum(int arr[], int n)
    {

        int a=0;int b=0;
        int curr_sum=arr[a];
        int max_sum=arr[a];
        while(b<arr.length)
        {
            if(curr_sum>max_sum)
            {
                max_sum=curr_sum;
                curr_sum=0;
                a++;
                b=a;
                continue;
            }
            else
            {
                curr_sum=curr_sum+arr[b];
                b=b+2;
            }
        }
        return max_sum;
    }
}

