package com.sandeep.interview.collections.numbers;

import com.sandeep.interview.collections.sorting.BubbleSortPrimitive;
import com.sandeep.interview.collections.strings.FindDuplicateChar;

/**
 * Created by Sandeep on 2/7/2017.
 */
//TODO:
public class FindMissingNumberInArray {
    int[] numbers = new int[50];

    public void insertNumbers() {
        for (int i = 49; i >= 0; i--) {
            this.numbers[i] = i;
        }

        int[] sortedNumbers = new BubbleSortPrimitive().sortNumbers(this.numbers);
//        System.out.println(sortedNumbers[45]);
        displayNumbers(sortedNumbers);
    }

    public void displayNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        FindMissingNumberInArray inArray = new FindMissingNumberInArray();
        inArray.insertNumbers();
    }
}
