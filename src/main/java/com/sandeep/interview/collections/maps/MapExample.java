package com.sandeep.interview.collections.maps;

import java.util.*;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class MapExample {

    private Map<String, String> map1 = new HashMap<String, String>();
    private Map<String, String> map2 = new TreeMap<String, String>();

    // TreeMap sorts data while insertion based ont he key.
    // HashMap is similar ro HashSet. we cannot sort
    public MapExample() {
        map1.put("one", "Number 1");
        map1.put("three", "Number 3");
        map1.put("two", "Number 2");
        map1.put("four", "Number 4");
        map1.put("six", "Number 6");
        map1.put("five", "Number 5");
        map2.putAll(map1);
    }

    public <K, V> void printMap() {

        System.out.println("-----------------hashMap-----------------------");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
        System.out.println("------------------TreeMap-natural sorting by key---------------------");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        MapExample example = new MapExample();
        example.printMap();
    }
}
