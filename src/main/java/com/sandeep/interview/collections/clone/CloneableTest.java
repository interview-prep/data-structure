package com.sandeep.interview.collections.clone;

/**
 * Created by Sandeep on 2/7/2017.
 */
public class CloneableTest {
    public static void main(String[] args) {
        PersonClonable p = new PersonClonable("Sandeep cloned");
        PersonClonable pClone = p.clone(); // Can you do this, if clone method in Person class is not public
        System.out.println(pClone.getName());
    }
}
