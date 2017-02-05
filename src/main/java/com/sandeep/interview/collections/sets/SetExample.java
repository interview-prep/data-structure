package com.sandeep.interview.collections.sets;

import java.util.*;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class SetExample {

    private Set<String> hashSetOfString = new HashSet<String>();
    private Set<String> treeSetOfString = new TreeSet<String>();

    public SetExample() {
        this.hashSetOfString.add("one");
        this.hashSetOfString.add("two");
        this.hashSetOfString.add("three");
        this.hashSetOfString.add("five");
        this.hashSetOfString.add("Eight");
        this.hashSetOfString.add("six");
        this.hashSetOfString.add("four");
        this.treeSetOfString.addAll(this.hashSetOfString);
    }

    public void getSetData() {
        // We cannot sort the data from set-HashSet. It wont give any guarantee of read order
        // List cannot be cast to HashSet
        Iterator<String> iterator = hashSetOfString.iterator();
        while (iterator.hasNext()) {
//            iterator.remove();
            //Exception in thread "main" java.util.ConcurrentModificationException: You cannot add element to set once start iterator
//            hashSetOfString.add("try adding new element here");
            System.out.println(iterator.next());
        }
        System.out.println("-----------------treeset sorder by natural sort----------------");
        iterator = treeSetOfString.iterator();
        while (iterator.hasNext()) {
//            iterator.remove();
            System.out.println(iterator.next());
        }
        for (String ss : hashSetOfString) {
//            java.util.ConcurrentModificationException
//            hashSetOfString.add("add element here");
            System.out.println(ss);
        }

    }

    public static void main(String[] args) {
        SetExample example = new SetExample();
        example.getSetData();
    }
}
