package com.sandeep.interview.collections.sorting;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class BubbleSortPrimitive {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 8, 4, 5,7};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            count++;
            for (int j = 1; j < arr.length - i; j++) {
                count++;
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break; // break element swapped
                }
            }
        }
        System.out.println(count);
        System.out.println(arr[1]);
    }
}
