package com.arrays;

public class WaterTrap {

    public static void main(String[] args) {
        int[] A= {3,0,1,2,5};
        int[] B= {2,0,2};
       // Naive solution
        //int sum=trapWater1(B);
        //Effective solution
        int sum=trapWater2(A);
        System.out.println(sum);
    }

    private static int trapWater2(int[] A) {

        int sum=0;
        int n= A.length;

        int[] l_max=new int[n];
        int[] r_max=new int[n];

        l_max[0]=A[0];
        for(int i=1;i<n;i++)
        {
            l_max[i]=Math.max(A[i],l_max[i-1]);
        }
        r_max[n-1]=A[n-1];
        for(int j=n-2;j>=0;j--)
        {
            r_max[j]= Math.max(A[n-2],r_max[n-1]);
        }

        for(int k=1;k<n-1;k++)
        {
            sum=sum+Math.min(l_max[k],r_max[k])-A[k];
        }

        return sum;
    }

    private static int trapWater1(int[] A) {

        int sum=0;
        int len= A.length;
        for(int i=1;i<len-1;i++)
        {
            int left_max=0;
            int right_max=0;
            for(int j=0;j<i;j++)
            {
                left_max= Math.max(A[j],left_max);
            }

            for(int j=i+1;j<len; j++)
            {
                right_max=Math.max(A[j],right_max);
            }

            sum= sum+ Math.min(left_max,right_max)-A[i];
        }
        return sum;
    }
}
