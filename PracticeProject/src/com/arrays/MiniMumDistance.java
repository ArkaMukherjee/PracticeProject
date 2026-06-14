package com.arrays;

import java.sql.SQLOutput;

public class MiniMumDistance {

    public static void main(String[] args) {
        int N = 27;
        int A[] = {13 ,98, 5, 10, 23, 13, 4, 53,60, 78, 66, 68, 44, 69, 79, 71, 90, 17, 91, 84, 34, 52, 12, 11, 57, 61, 2};
        int x = 78, y = 68;
        System.out.println(minDist(A,N,x,y));
    }

    private static int minDist(int a[], int n, int x, int y) {
        // code here

        int i=0,j=0;
        int first_posiition=Integer.MAX_VALUE;
        int second_position=Integer.MAX_VALUE;
        int min_distance=Integer.MAX_VALUE;
        while(i<n)
        {

            if(a[i]==x)
            {
                first_posiition = i;
            }
            else if (a[i]==y)
            {
                second_position=i;
            }
            if(first_posiition!=second_position) {
                min_distance = first_posiition < second_position ? Math.min(min_distance, (second_position - first_posiition)) : Math.min(min_distance, (first_posiition - second_position));
            }
            i++;
        }
        return min_distance;
    }
}
