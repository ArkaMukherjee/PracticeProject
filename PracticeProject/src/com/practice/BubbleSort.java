package com.practice;

public class BubbleSort {

    public int[] bubbleSort(int[] itemList) {
        for (int i = 0; i < itemList.length; i++) {
            for (int j = i+1; j < itemList.length; j++) {
                if (itemList[i] > itemList[j]) {
                    int temp = itemList[j];
                    itemList[j] = itemList[i];
                    itemList[i] = temp;
                }
            }
        }
        return itemList;
    }


    public static void main(String arg[]) {
        //List<String> s= Arrays.asList("Arka","Arghya");
        int[] intList = {2, 2, 9, 6, 8, 3,-1,78,6,3,11,3};
        BubbleSort b = new BubbleSort();
        int[] sortedList=b.bubbleSort(intList);
        for( int i=0 ;i<sortedList.length;i++) {
            System.out.println(sortedList[i]);
        }
        //System.out.println("Arka".compareTo("Arghya"));
    }
}
