package com.sandeep.interview.collections.arrays;

import java.util.Comparator;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class SortPersonComparator implements Comparator<Student> {

    int sortBy;

    public SortPersonComparator(int sortBy) {
        this.sortBy = sortBy;
    }

    public int compare(Student o1, Student o2) {
        int sortResult = 0;
        switch (sortBy) {
            case 0:
                sortResult = o1.getName().compareToIgnoreCase(o2.getName());
                break;
            case 1:
                sortResult = o2.getName().compareToIgnoreCase(o1.getName());
                break;
            case 2:
                sortResult = o1.getGrade() - o2.getGrade();
                break;
            default:
                break;
        }
        return sortResult;
    }
}
