package com;

public class MinimumSumSubArray {

    public static void main(String[] args) {

        int[] a = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, a));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int a =0 ,b =0;
        int min =Integer.MAX_VALUE;
        int sum=0;
        while(b<nums.length)
        {

            if(sum<target && a<nums.length)
            {
                sum=sum+nums[a];
                a++;
            }
            else  {
                min = sum>=target? Math.min(min, (a - b)):min;
                sum = sum - nums[b];
                b++;
            }
        }
        return min == Integer.MAX_VALUE? 0 : min;
    }
}
