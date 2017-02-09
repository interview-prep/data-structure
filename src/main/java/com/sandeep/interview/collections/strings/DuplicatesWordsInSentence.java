package com.sandeep.interview.collections.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class DuplicatesWordsInSentence {
    public static void main(String[] args) {
        String test = "This sentence contains two words, one and two";
        Set<String> duplicates = duplicateWords(test);
        System.out.println("input : " + test);
        System.out.println("output : " + duplicates);
    }

    /**
     * Method to find duplicate words in a Sentence or String * @param input String * @return set of duplicate words
     */
    public static Set<String> duplicateWords(String input) {
        System.out.println(input);
        if (input == null || input.length() == 0) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<String>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<String>();
        for (String word : words) {
            if (!set.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }

}
