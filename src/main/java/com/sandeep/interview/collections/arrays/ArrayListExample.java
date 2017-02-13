package com.sandeep.interview.collections.arrays;

import java.util.*;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class ArrayListExample {

    private List<String> strings = new ArrayList<String>();

    public ArrayListExample() {
        this.strings.add("one");
        this.strings.add("two");
        this.strings.add("three");
        this.strings.add("five");
        this.strings.add("six");
        this.strings.add("four");
    }

    public void getSimpleStringData() {
//        this.strings.remove(new String("one"));// removing object using object is safer else throw java.lang.IndexOutOfBoundsException:
//        this.strings.remove(1);// --1
//        this.strings.remove(3); // --1
//        this.strings.remove(5); java.lang.IndexOutOfBoundsException: Index: 5, Size: 4
        this.strings.remove(new String("five"));
        Collections.sort(strings);//order by natural
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }
        System.out.println("----------------------");
        for (String s : strings) {
            System.out.println(s);
            this.strings.remove(new String(s));//Exception in thread "main" java.util.ConcurrentModificationException
        }
    }

    public static void main(String[] args) {
        ArrayListExample example = new ArrayListExample();
        example.getSimpleStringData();
    }
}
