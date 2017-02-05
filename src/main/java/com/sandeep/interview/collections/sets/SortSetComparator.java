package com.sandeep.interview.collections.sets;

import java.util.Comparator;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class SortSetComparator implements Comparator<House> {
    private int sortBy;

    public SortSetComparator(int by) {
        this.sortBy = by;
    }

    public int compare(House o1, House o2) {
        int sortResult = -1;
        switch (sortBy) {
            case 0:
                sortResult = o1.getCurrentStatus().name().compareToIgnoreCase(o2.getCurrentStatus().name());
                break;
            case 1:
                sortResult = o1.getCity().compareToIgnoreCase(o2.getCity());
                break;
            case 2:
                sortResult = o1.getDate().compareTo(o2.getDate());
                break;
            default:
                break;
        }
        return sortResult;
    }
}
