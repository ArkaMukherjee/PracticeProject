package com.sorting.mergesort;

public class MergeTest {
    public static void main(String arg[])
    {
        MergeSort ms= new MergeSort();
        int[] unsortedArray= new int[]{9,25,17,4,11,8,23,20};
        int[] sortArray=ms.divideAndSort(unsortedArray);
        for(int i=0;i<sortArray.length;i++)
        {
            System.out.print(sortArray[i]+", ");
        }

    }
}
