package com.sorting.mergesort;

public class MergeSort {

    public int[] divideAndSort(int[] unsortedArray) {
        int lengthOfArray = unsortedArray.length;
        int[] sortedArray = new int[lengthOfArray];
        if (lengthOfArray < 2) {
            return unsortedArray;
        } else {
            int mid = (0 + lengthOfArray) / 2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[lengthOfArray - mid];
            for (int i = 0; i <= (mid - 1); i++) {
                leftArray[i] = unsortedArray[i];
            }
            for (int i = mid; i <= (lengthOfArray - 1); i++) {
                rightArray[i-mid] = unsortedArray[i];
            }
            leftArray=divideAndSort(leftArray);
            rightArray=divideAndSort(rightArray);
            mergeArrays(leftArray, rightArray, sortedArray);
            return sortedArray;
        }
    }

    private void mergeArrays(int[] leftArray, int[] rightArray, int[] sortedArray) {
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;
        int i = 0, j = 0, k = 0;
        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] < rightArray[j]) {
                sortedArray[k] = leftArray[i];
                i=i+1;
            } else {
                sortedArray[k] = rightArray[j];
                j=j+1;
            }
            k = k + 1;
        }
        while (i < leftArraySize) {
            sortedArray[k] = leftArray[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < rightArraySize) {
            sortedArray[k] = rightArray[j];
            j = j + 1;
            k = k + 1;
        }
    }
}
