package com.sandeep.interview.collections.numbers;

/**
 * Created by Sandeep on 2/9/2017.
 */
public class FibInterviewProgram {
    public static void main(String[] args) {

        int index = 0;
        int next = 1;
        int incr = 0;

        System.out.print(index + ", " + next);

        for (int i = index; i < 15; ++i) {
            incr = index + next;
            System.out.print(", " + incr);
            index = next;
            next = incr;

        }
    }
}
