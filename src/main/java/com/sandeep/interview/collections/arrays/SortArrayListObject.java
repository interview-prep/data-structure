package com.sandeep.interview.collections.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sandeep on 2/5/2017.
 */
public class SortArrayListObject {
    public static void main(String[] args) {
        List<Person> personsComparable = new ArrayList<Person>();
        personsComparable.add(new Person("Sandeep M", 65));
        personsComparable.add(new Person("Vijaylaxmi R", 93));
        personsComparable.add(new Person("Shridhar BT", 47));
        personsComparable.add(new Person("Sanmay M", 52));

        Collections.sort(personsComparable);
        System.out.println(personsComparable);

        List<Student> personsComparator = new ArrayList<Student>();
        personsComparator.add(new Student("Sandeep M", 65));
        personsComparator.add(new Student("Vijaylaxmi R", 93));
        personsComparator.add(new Student("Shridhar BT", 47));
        personsComparator.add(new Student("Sanmay M", 52));

//        Collections.sort(personsComparator)
        Collections.sort(personsComparator, new SortPersonComparator(Order.ASC.ordinal()));
        System.out.println(personsComparator);
    }

    enum Order {
        ASC(0),
        DESC(1),
        BYGRADE(2);

        Order(int i) {

        }
    }
}
