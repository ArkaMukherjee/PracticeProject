package com.sorting.quicksort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 7, 2, 11, 9,9,6, 3, 4};
        quickSort(arr, 0, (arr.length - 1));

        for (int i : arr) {
            System.out.println(i + ",");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {

        if (start < end) {
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp;
                temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        int temp;
        temp=arr[pIndex];
        arr[pIndex]=arr[end];
        arr[end]=temp;
        //arr[pIndex]=pivot;
        return pIndex;
    }
}
