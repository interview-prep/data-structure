package com.sandeep.interview.collections.oops;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class ParentWithStatic {

    public static void methodOne() {
        System.out.println("methodOne in parent");
    }
    public void nonStaticMethodOne() {
        System.out.println("non static methodOne in parent");
    }
    public static void methodOne(int x) {
        System.out.println("methodOne in parent with int x");
    }

    public static void methodOne(String x) {
        System.out.println("methodOne in parent with string x");
    }

    public static void methodOne(int x, String y) {
        System.out.println("methodOne in parent with x and y");
    }
}
