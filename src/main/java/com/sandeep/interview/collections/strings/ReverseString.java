package com.sandeep.interview.collections.strings;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class ReverseString {


    public String reverseString() {
        String str = "abc";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + String.valueOf(str.charAt(i));
        }
        System.out.println(result);
        return result;
    }

    public String reverseRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }


    public static void main(String[] args) {
        new ReverseString().reverseString();
        System.out.println(new ReverseString().reverseRecursively("abc"));
    }
}
