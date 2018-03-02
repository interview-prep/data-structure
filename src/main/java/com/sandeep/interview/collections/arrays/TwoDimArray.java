package com.sandeep.interview.collections.arrays;

import java.util.Random;

/**
 * Created by SESA455669 on 02-03-2018.
 */
public class TwoDimArray {
    public static void main(String[] args) {

        int x[][] = new int[3][3];
        int s[] = new int[3];
        System.out.println(x.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = i + j + new Random().nextInt(6);
            }
        }

        // find sum of each row
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-3d", x[i][j]);
                sum += x[i][j];

            }
            System.out.println("= " + sum);
        }


        System.out.println("===============\n\n");
// find sum of each column
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-3d", x[i][j]);
                sum += x[j][i];
                s[i] = sum;
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-3s", "_");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-3d", s[i]);
        }
        System.out.println("\n================");


    }
}
