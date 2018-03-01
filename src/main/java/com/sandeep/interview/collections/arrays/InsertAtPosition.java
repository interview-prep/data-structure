package com.sandeep.interview.collections.arrays;

/**
 * Created by SESA455669 on 01-03-2018.
 */
public class InsertAtPosition {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n;
        int index = 3;
        int temp[] = new int[a.length + 10];
        ;
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            temp[i] = a[i];
        }

        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[3] = 100;

        for (int i = 0; i < temp.length; i++) {
            System.out.println(" | " + i + ":" + temp[i] + " | ");
        }
    }
}
