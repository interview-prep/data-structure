package com.sandeep.interview.collections.hackerrank;

import java.util.Scanner;

/**
 * Created by Sandeep on 2/8/2017.
 */
public class SolutionFormatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%s15 %d", s1, x);
        }
        System.out.println("================================");

    }
}
