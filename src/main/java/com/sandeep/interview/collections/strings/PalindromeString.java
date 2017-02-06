package com.sandeep.interview.collections.strings;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class PalindromeString {
    public static void main(String[] args) {
        String str = "bcb";
        ReverseString r = new ReverseString();
        String reverse = r.reverseRecursively(str);

        if (str.length() == reverse.length()) {
            if(str.equals(reverse)){
                System.out.println("String palindrome");
            } else{
                System.out.println("String not palindrome");
            }
        }
    }
}
