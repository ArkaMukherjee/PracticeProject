package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> listOfList= new ArrayList<>();
        int len= nums.length;
        if(len<3)
        {
            System.out.println(listOfList);
        }

        int i=0,j=0;
        List<Integer> ls= new ArrayList<>();
        int sum=0;
        while(j<len)
        {

            if( ls.size()<3)
            {
                sum=sum+nums[j];
                ls.add(nums[j]);

            }
            j++;
            if(sum==0 && ls.size()==3)
            {
                listOfList.add(ls);
                ls.clear();
                i++;
                j=i;
            }

        }

        System.out.println(listOfList);
    }
}
