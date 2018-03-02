package com.sandeep.interview.collections.sorting;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class BubbleSortPrimitive {
    public int[] sortNumbers(int[] arr){
//        int[] arr = new int[]{7, 2, 8, 4, 5, 7};
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
//                    break; // break element swapped
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
            new BubbleSortPrimitive().sortNumbers(new int[]{7, 2, 8, 4, 5, 7});
    }
}
