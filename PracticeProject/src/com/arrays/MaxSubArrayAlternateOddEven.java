package com.arrays;

public class MaxSubArrayAlternateOddEven {
    public static void main(String[] args) {
        int[] A={5,10,20,6,3,8};

       // Naive Solution
        process1(A);
        //Kadans Also
       // process2(A);
    }

    private static void process1(int[] A) {


        int max=1;
        for(int i=1;i<A.length;i++)
        {
            int count=1;
           for(int j=i;j<A.length;j++)
           {
                if((A[j]%2==0 && A[j-1]%2==1)||(A[j]%2==1 && A[j-1]%2==0))
                {
                    count++;
                }
                else
                {
                    break;
                }
                max= Math.max(count,max);
           }
        }
        System.out.println(max);
    }

    private static void process2(int[] A) {

        int count=1;
        int max_length=1;
        for(int i=1;i<A.length;i++)
        {
            if((A[i]%2==0 && A[i-1]%2==1) || (A[i]%2==1 && A[i-1]%2==0))
            {
                count++;
                max_length=Math.max(max_length,count);
            }
            else
            {
                count=1;
            }
        }
        System.out.println(max_length);
    }

}
