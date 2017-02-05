package com.sandeep.interview.collections.maps;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class SortMapComparator implements Comparator<Map.Entry<Book, Book>> {
    int orderBy = -1;

    public SortMapComparator(int ordinal) {
        this.orderBy = ordinal;
    }

    //TODO : working on this
    public int compare(Map.Entry<Book, Book> o1, Map.Entry<Book, Book> o2) {
        int sortResult = -1;
        switch (orderBy) {
            case 0:
                sortResult = o1.getValue().getCode() - (o2.getValue().getCode());
                break;
            case 1:
                sortResult = o1.getValue().getName().compareToIgnoreCase(o2.getValue().getName());
                break;
            case 2:
                sortResult = o1.getValue().getAuth().compareToIgnoreCase(o2.getValue().getAuth());
                break;
            case 3:
                sortResult = o1.getValue().getPubDate().compareTo(o2.getValue().getPubDate());
                break;
            default:
                break;
        }
        return sortResult;
    }
}
