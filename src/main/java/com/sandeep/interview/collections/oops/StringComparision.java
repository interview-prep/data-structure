package com.sandeep.interview.collections.oops;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class StringComparision {

    public boolean isStringEqualsNew(String s1, String s2) {
        String x = new String(s1);
        String y = new String(s2);
        System.out.println("compareTo : " + x.compareTo(y));
        if (x == y) {
            return true;
        }
        return false;
    }

    public boolean isStringEquals(String s1, String s2) {
        String x = s1;
        String y = s2;
        System.out.println("compareTo : " + x.compareTo(y));
        if (x == y) {
            return true;
        }
        return false;
    }

    public boolean isStringIsEqualsNew(String s1, String s2) {
        String x = new String(s1);
        String y = new String(s2);
//        equals()method compare two Strings for content equality
        System.out.println("compareTo : " + x.compareTo(y));
        if (x.equalsIgnoreCase(y)) {
            return true;
        }
        return false;
    }

    public boolean isStringIsEquals(String s1, String s2) {
        String x = s1;
        String y = s2;
        //equals()method compare two Strings for content equality
        System.out.println("compareTo : " + x.compareTo(y));
        if (x.equalsIgnoreCase(y)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        StringComparision comparision = new StringComparision();
        System.out.println(comparision.isStringEqualsNew("Sandeep", "SaNdeep"));
        System.out.println(comparision.isStringEquals("Sandeep", "Sandeep"));
        System.out.println(comparision.isStringIsEqualsNew("Sandeep", "SaNeep"));
        System.out.println(comparision.isStringIsEquals("Sandeep", "Sandeep"));
    }
}
