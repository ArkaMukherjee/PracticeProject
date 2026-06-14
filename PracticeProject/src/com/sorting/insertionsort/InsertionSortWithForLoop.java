package com.sorting.insertionsort;

public class InsertionSortWithForLoop {

    public static void main(String[] args) {
        int[] a = new int[]{7, 3, 6, 1, 4, 9};
        InsertionSortWithForLoop insertionSort = new InsertionSortWithForLoop();
        insertionSort.sort(a);

        for (int j : a) {
            System.out.println(j);
        }
    }

    private void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j;
            for (j = i; j > 0 && a[j - 1] > value; j--) {
                a[j] = a[j - 1];
            }
            a[j] = value;
        }
    }
}
