package com.test.circulararray;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CircularArray {

    public void printArray(char[] arr, int arraySize, int position) {
/*        char[] charArray = new char[2 * arraySize];
        for (int i = 0; i < arraySize; i++) {
            charArray[i] = charArray[i + arraySize] = arr[i];
        }
        for (int i = position; i < arraySize + position; i++) {
            System.out.println(charArray[i]);
        }*/

        for (int i = position; i < position + arraySize; i++) {
            System.out.println(arr[(i % arraySize)]);
        }


    }

    public static void main(String arg[]) {
        char[] charArray = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        CircularArray c = new CircularArray();
        c.printArray(charArray, charArray.length, 5);
    }

}
