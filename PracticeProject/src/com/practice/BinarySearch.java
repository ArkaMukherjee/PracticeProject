package com.practice;

public class BinarySearch {

	public static int findNumber(Integer[] arr, int value, int start, int end) {
		int mid;
		if(start <= end) {
			mid = (start + end) / 2;
			if (value < arr[mid]) {

				return findNumber(arr, value, 0,( mid - 1));
			} else if (value > arr[mid]) { 
				return findNumber(arr, value, (mid + 1), end);
			} else {
				return mid;
			}
		}
		return -1;

	}

	public static void main(String arg[]) {
		Integer[] array = { 2, 4, 7, 34, 56, 67, 69 };
		int value = 2;
		System.out.println("required value position in array is :  " + findNumber(array, value, 0, array.length-1));
		;

	}

}
