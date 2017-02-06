package com.sandeep.interview.collections.container;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class BasicSingleTon {

    private static BasicSingleTon BASICSINGLETON;

    private BasicSingleTon() {
    }

    public static BasicSingleTon getSingleInstance() {
        System.out.println(BASICSINGLETON);
        if (BASICSINGLETON == null) {
            BASICSINGLETON = new BasicSingleTon();
        }
        return BASICSINGLETON;
    }

    public void getDummyData() {
        System.out.println("Dummy");
    }
}