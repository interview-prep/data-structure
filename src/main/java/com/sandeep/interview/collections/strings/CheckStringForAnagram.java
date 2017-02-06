package com.sandeep.interview.collections.strings;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class CheckStringForAnagram {

    public boolean checkStringForAnagramUsingC() {

        String word1 = "stops";
        String word2 = "spots";

        if (word1.length() != word2.length()) {
            return false;
        }
        System.out.println("equal length");
        char[] chars = word1.toCharArray();
        for (char c : chars) {
            int index = word2.indexOf(c);
            if (index != -1) {
                word2 = word2.substring(0, index) + word2.substring(index + 1, word2.length());
                System.out.println(word2);
            } else {
                return false;
            }
        }
        return word2.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(new CheckStringForAnagram().checkStringForAnagramUsingC());
    }
}
