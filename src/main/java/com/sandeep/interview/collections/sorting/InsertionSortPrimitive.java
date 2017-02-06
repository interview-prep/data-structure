package com.sandeep.interview.collections.sorting;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class InsertionSortPrimitive {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 8, 4, 5, 9};
        int insertIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j;

            /*int j = i-1 ;
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;*/

//            for (j = i - 1; j >= 0 && arr[j] < value; j--) { // reverse sorting
            for (j = i - 1; j >= 0 && arr[j] > value; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = value;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
