package com.sandeep.interview.collections.strings;

/**
 * Created by Sandeep on 5/9/2017.
 */
public class Immutable {

    public static void main(String[] args) {
        String str = "abc efg";
        String str1= str.replaceAll("efg", "xyz");
        System.out.println(str1);
        System.out.println(str);
    }
}
