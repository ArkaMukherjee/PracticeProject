package com.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 9, 14, 45, 65, 78, 100};
        int searchElement = 1000;
        int length = arr.length;
        int searchElementPosition = search(arr, 0, length - 1, searchElement);
        if (searchElementPosition < 0) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Position of the element in array is :" +searchElementPosition);
        }
    }

    public static int search(int[] searchArray, int startIndex, int endIndex, int element) {
        if (endIndex >= startIndex) {

            int mid = (startIndex + startIndex) / 2;
            if (searchArray[mid] == element) {
                return mid;
            } else if (element > searchArray[mid]) {
                return search(searchArray, mid + 1, endIndex, element);
            } else {
                return search(searchArray, startIndex, mid - 1, element);
            }
        }
        return -100;
    }
}