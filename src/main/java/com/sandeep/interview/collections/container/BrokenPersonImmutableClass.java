package com.sandeep.interview.collections.container;

import com.sandeep.interview.collections.arrays.Person;

import java.util.Date;

/**
 * Created by Sandeep on 2/13/2017.
 */
public final class BrokenPersonImmutableClass {

    private final String fname;
    private final String lname;
    private final Date date;
    private final Person p;

    public BrokenPersonImmutableClass(String fname, String lname, Date date, Person p) {
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.p = p;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Date getDate() {
        return date;
    }

    public Person getP() {
        return p;
    }

    public static void main(String s[]) {
        BrokenPersonImmutableClass immStr = new BrokenPersonImmutableClass("sandeep", "M", new Date(), new Person("123", 123));
        System.out.println(immStr.getFname());
        System.out.println(immStr.getLname());
        System.out.println(immStr.getDate());
        System.out.println(immStr.getP());
    }
}
