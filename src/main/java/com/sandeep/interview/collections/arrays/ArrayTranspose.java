package com.sandeep.interview.collections.arrays;

import java.util.Random;

/**
 * Created by SESA455669 on 02-03-2018.
 */
public class ArrayTranspose {
    public static void main(String[] args) {
        int x[][] = new int[3][3];
        int s[] = new int[3];
        System.out.println("matrix length : " + x.length);
        System.out.println("[Original 3 by 3 matrix]");
        System.out.println("---------------------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = i + j + new Random().nextInt(6);
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        //TODO transpose working on it
        System.out.println();
        int y[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                y[j][i] = x[i][j];
            }
        }

        System.out.println("\n[Transposed 3 by 3 matrix]");
        System.out.println("--------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("column " + i + " => ");
            for (int j = 0; j < 3; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }
}
