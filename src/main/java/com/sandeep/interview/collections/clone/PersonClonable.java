package com.sandeep.interview.collections.clone;

/**
 * Created by Sandeep on 2/7/2017.
 */
public class PersonClonable implements Cloneable {
    private String name;

    public PersonClonable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PersonClonable clone() {
        try {
            return (PersonClonable) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
