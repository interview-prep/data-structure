package com.sandeep.interview.collections.container;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton INSTANCE;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                //double checking Singleton instance
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}