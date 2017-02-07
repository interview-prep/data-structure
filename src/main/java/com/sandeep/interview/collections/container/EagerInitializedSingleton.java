package com.sandeep.interview.collections.container;

/**
 * Created by Sandeep on 2/7/2017.
 */
public class EagerInitializedSingleton {

    byte x;
    long y;
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
        y= x;
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
