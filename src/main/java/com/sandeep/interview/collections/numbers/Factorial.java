package com.sandeep.interview.collections.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

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
        IntBinaryOperator intBinaryOperator = (int x, int y) -> {
            return x + y;
        };
        System.out.println(intBinaryOperator.applyAsInt(12, 0));
        List<String> countries = Arrays.asList("Australia","Brazil", "China","Denmark","England","France","Germany");

        Stream<String> stringStream = countries.stream().map(name -> name.toUpperCase());
        System.out.println(stringStream.distinct().limit(2));

    }
}
