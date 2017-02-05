package com.sandeep.interview.collections.sets;

import java.text.ParseException;
import java.util.*;

import com.sandeep.interview.collections.sets.House.Status;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class SortSetExample {
    public static void main(String[] args) throws ParseException {
        Set<House> houses = new HashSet<House>();
        houses.add(new House(Status.AVAILABLE, "New York City", "2007-11-11"));
        houses.add(new House(Status.SOLD, "Los Angeles", "2005-06-11"));
        houses.add(new House(Status.AVAILABLE, "Chicago", "2012-05-03"));
        houses.add(new House(Status.CONTINGENT, "Portland", "2007-10-11"));
//        houses.add(null); this cause NPE exception while iterating/camparing. aviod adding nulls in set
//        houses.add(null);
        System.out.println(houses);

        List<House> houseListCopy = new ArrayList<House>(houses);
        Collections.sort(houseListCopy, new SortSetComparator(0));

        System.out.println(houseListCopy);
// if your sorting element is repeated then treeset remove duplicates.
        Set<House> treeSetSort = new TreeSet<House>(new SortSetComparator(0));
        treeSetSort.addAll(houses);
        System.out.println(treeSetSort);
    }
}
