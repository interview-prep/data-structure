package com.sandeep.interview.collections.maps;

import java.util.*;

/**
 * Created by Sandeep on 5/15/2017.
 */
public class JavaObjectSorting {
    public static void main(String[] args) {
        //sort primitives array like int array
        int[] intArr = {5, 9, 1, 10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //sorting String array
        String[] strArr = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        //sorting list of objects of Wrapper classes
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.unmodifiableList(strList);// collection is not modified but sorted
        strList.add("D");
        strList.set(2,"f");
        Collections.sort(strList);
        for (String str : strList) System.out.print(" " + str);

        ArrayList readableList = new ArrayList();
        readableList.add("Jeffrey Archer");
        readableList.add("Khalid Hussain");

        List unmodifiableList = Collections.unmodifiableList(readableList);

        //add will throw Exception because List is readonly
        unmodifiableList.add("R.K. Narayan");
    }

}
