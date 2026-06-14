package com.sorting.insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = new int[]{12, 11, 13, 5, 6,-7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(a);
    }

    public void sort(int[] a) {
        int length = a.length;
        for (int firstUnsortedElementIndex = 1; firstUnsortedElementIndex < length; firstUnsortedElementIndex++) {
            int value = a[firstUnsortedElementIndex];
            int j=firstUnsortedElementIndex;
          /*  for (j = firstUnsortedElementIndex; j > 0 && a[j - 1] > value; j--) {
                a[j] = a[j - 1];
            }*/
            while(j>0 && a[j-1]>value) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = value;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ",");
        }
    }

    /*void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            *//* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position *//*
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
    }*/
}
