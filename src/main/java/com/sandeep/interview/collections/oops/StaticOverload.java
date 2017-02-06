package com.sandeep.interview.collections.oops;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class StaticOverload extends ParentWithStatic {

    public static void methodOne() {
        System.out.println("methodOne");
    }

    public void nonStaticMethodOne() {
        System.out.println("non static methodOne in child");
    }

    public static void methodOne(int x) {
        System.out.println("methodOne with int x");
    }

    public static void methodOne(String x) {
        System.out.println("methodOne with string x");
    }

    public static void methodOne(int x, String y) {
        System.out.println("methodOne with x and y");
    }

    public static void main(String[] args) {
        ParentWithStatic overload = new StaticOverload();
        overload.methodOne();
        overload.nonStaticMethodOne();
        StaticOverload.methodOne();
        StaticOverload.methodOne(12);
        StaticOverload.methodOne("Sandeep");
        StaticOverload.methodOne(12, "Sandeep");
    }
}
