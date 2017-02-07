package com.sandeep.interview.collections.numbers;

import com.sandeep.interview.collections.sorting.BubbleSortPrimitive;
import com.sandeep.interview.collections.strings.FindDuplicateChar;

/**
 * Created by Sandeep on 2/7/2017.
 */
//TODO:
public class FindMissingNumberInArray {
    /*int[] numbers = new int[50];

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
    }*/

    private static void findMissingNumber(int[] number) {

        // take max length as last number in array
        int k[] = new int[number[number.length - 1]];

        int m = 0;

        if (number[0] != 1) {
            for (int x = 1; x < number[0]; x++) {
                k[m] = x;
                m++;
            }
        }

        for (int i = 0; i < number.length - 1; i++) {

            int j = i + 1;
            int difference = number[j] - number[i];


            if (difference != 1) {

                for (int x = 1; x < difference; x++) {

                    k[m] = number[i] + x;
                    m++;

                }

            }
        }

        System.out.println("missing numbers in array ::");

        for (int l = 0; l < m; l++) {
            System.out.println(k[l] + " ");
        }
    }


    public static void main(String[] args) {
        FindMissingNumberInArray inArray = new FindMissingNumberInArray();
        FindMissingNumberInArray.findMissingNumber(new int[]{2, 4, 6, 9, 10, 20});
    }
}
