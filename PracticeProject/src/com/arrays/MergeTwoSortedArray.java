package com.arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        Integer[] a = {2, 7, 15, 21, 67, 99};
        Integer[] b = {5, 9, 17, 28, 77, 89};

        Integer[] finalArray = new Integer[a.length+b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                finalArray[k] = b[j];
                j++;
            } else {
                finalArray[k] = a[i];
                i++;
            }
            k = k + 1;
        }
        while (i < a.length) {
            finalArray[k] = a[i];
            k = k + 1;
            i++;
        }
        while (j < b.length) {
            finalArray[k] = b[j];
            k = k + 1;
            j++;
        }

        for(int x=0;x<finalArray.length ;x++)
        {
            System.out.println(finalArray[x]);
        }
    }
}
