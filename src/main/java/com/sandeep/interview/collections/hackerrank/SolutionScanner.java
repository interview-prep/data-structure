package com.sandeep.interview.collections.hackerrank;

import java.util.Scanner;

/**
 * Created by Sandeep on 2/8/2017.
 */
public class SolutionScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine(); //IMP Line
        //Scanner scan1 = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}