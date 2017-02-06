package com.sandeep.interview.collections.container;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class UseSingleTon {

    public static void main(String[] args) {
//        BasicSingleTon basicSingleTon = new BasicSingleTon();// cannot possible because its privates
        BasicSingleTon singleInstance = BasicSingleTon.getSingleInstance();
        singleInstance.getDummyData();

        DoubleCheckedLockingSingleton instance = DoubleCheckedLockingSingleton.getInstance();
        instance.hashCode();
    }
}
