package com.sandeep.interview.collections.numbers;

/**
 * Created by Sandeep on 2/9/2017.
 */
public class Factorial {

    public int recFact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recFact(n - 1);
    }

    public int nonRecFact(int n) {
        int result = 1;
        if (n == 0) {
            return result;
        }
        while (n !=0 ) {
            result = result * n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial f= new Factorial();
        System.out.println(f.recFact(5));
        System.out.println(f.nonRecFact(5));
    }
}
