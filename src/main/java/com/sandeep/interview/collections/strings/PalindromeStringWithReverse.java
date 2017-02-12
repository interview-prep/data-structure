package com.sandeep.interview.collections.strings;

/**
 * Created by Sandeep on 2/12/2017.
 */
public class PalindromeStringWithReverse {
    public static void main(String[] args) {
        String str = "21raceca r12";
        str = str.replaceAll(" ", "");
        boolean isPalindrome = false;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt((str.length() - 1) - i)) {
                isPalindrome = true;
                continue;
            }
            isPalindrome = false;
        }
        if (isPalindrome) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }

    }
}
