package com;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String arg[])
    {

        //Test t = new Test(5);

        // Reference is passed and a copy of reference
        // is created in change()
       // change(t);

        // New value of x is printed
        //System.out.println(t.x);

        /*Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);*/
/*
        Test t1= new Test();
        change(t1);
        System.out.println(t1.getX());*/

       // isPalindrome("A man, a plan, a canal: Panama");
        int[] nums = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(nums , 5));

    }

        public static int subarraysDivByK(int[] nums, int k) {
            int j=0,i=0;
            int count=0;
            int sum=0;
           // while(j<nums.length)
           // {
                for(;i<nums.length;i++)
                {
                    sum=sum+nums[i];
                    if(sum%k==0)
                    {
                        sum=sum-nums[j];
                        count++;
                        j++;
                        break;
                    }
                }

           // }
            return count;
        }


    public static boolean isPalindrome(String s) {

        // char[] charArray = s.toCharArray();

        List<Character> sChar= new ArrayList<>();

        for(int i=0;i<s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                sChar.add(s.charAt(i));
            }
        }

        for(int j=0, k=(sChar.size()-1); j<k ;)
        {
            if(sChar.get(j)!=sChar.get(k))
            {
                return false;
            }
            else
            {
                j++;
                k--;
            }
        }

        return true;
    }
    public static void swap(Integer i, Integer j)
    {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }


    public static void change(Test t)
    {
       // t= new Test();
        t.x = 10;
    }
}

class Test
{
    int x;
    Test(int i) { x = i; }
    Test()      { x = 0; }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
