package com.sandeep.interview.collections.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class FindDuplicateChar {

    private String name;

    public FindDuplicateChar(String name) {
        this.name = name;
    }

    public void printDuplicatesInCStyle() {
        char[] chars = name.toCharArray();
        int count;
        String res = "";
        String a = name;
        while (a.length() > 0) {
            int c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(0) == a.charAt(j))
                    c = c + 1;
            }
            res = res + a.charAt(0) + "=" + c + "\n";
            String k[] = a.split(a.charAt(0) + "");
            a = new String("");
            for (int i = 0; i < k.length; i++) {
                a = a + k[i];
            }
        }
        System.out.println(res);

    }

    public void printDuplicates() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = name.toCharArray();
        for (Character c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());
        }

        /*for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }*/

    }

    public static void main(String[] args) {
        FindDuplicateChar aChar = new FindDuplicateChar("Sandeep");
        aChar.printDuplicates();
        aChar.printDuplicatesInCStyle();
    }
}
