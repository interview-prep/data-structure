package com.sandeep.interview.collections.arrays;

import java.util.Random;

/**
 * Created by SESA455669 on 02-03-2018.
 */
public class TwoDimArray {
    public static void main(String[] args) {


        int x[][] = new int[3][3];
        int s[] = new int[3];
        System.out.println("matrix length : " + x.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = i + j + new Random().nextInt(6);
            }
        }

        // find sum of each row and column  3 by 3 matrix
        System.out.println("[sum of each row and column  3 by 3 matrix]");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 3; i++) {
            int sumOfRows = 0;
            int sumOfColumns = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-3d", x[i][j]);
                sumOfRows += x[i][j];
                sumOfColumns += x[j][i];
                s[i] = sumOfColumns;
            }
            System.out.println("= " + sumOfRows);
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-3s", "_");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-3d", s[i]);
        }
        System.out.println("\n===============\n\n");



        System.out.println("[sum of each row and column  3 by 4 matrix]");
        System.out.println("---------------------------------------------");
// find sum of each column  3 by 4 matrix
        int y[][] = new int[3][4];
        int s1[] = new int[4];

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                y[i][j] = i + j + new Random().nextInt(6);
                System.out.printf("%-3d", y[i][j]);
                sum += y[i][j];
            }
            System.out.println("= " + sum);
        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
//                System.out.printf("[%d][%d]%-3d", j, i, y[j][i]);
//                System.out.printf("%-3d", y[i][j]);
                sum += y[j][i];
                s1[i] = sum;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-3s", "_");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-3d", s1[i]);
        }
        System.out.println("\n================");

    }
}
