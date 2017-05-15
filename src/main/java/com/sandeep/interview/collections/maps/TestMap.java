package com.sandeep.interview.collections.maps;

import java.util.HashMap;

/**
 * Created by Sandeep on 5/15/2017.
 */
public class TestMap {
    public static void main(String args[]) {

        HashMap<String, String> m = new HashMap<String, String>();
        m.put(null, "2");
        m.put(null, null);
        m.put("1", "1");

        System.out.println(m);
    }
}
