package com.sandeep.interview.collections.maps;

import java.util.*;

/**
 * Created by Sandeep on 2/6/2017.
 */
public class Books {

    Map<Book, Book> bookMap = new HashMap<Book, Book>();

    Books() {

        Book book1 = new Book(123, "Book1", "Sandeep M", new Date());
        Book book2 = new Book(124, "Book2", "Sanmay M", new Date());
        Book book3 = new Book(125, "Book3", "Sanmay M", new Date());
        Book book4 = new Book(126, "Book4", "Sandeep M", new Date());
        Book book5 = new Book(127, "Book5", "Sandeep M", new Date());

        bookMap.put(book1, book1);
        bookMap.put(book2, book2);
        bookMap.put(book3, book3);
        bookMap.put(book4, book4);
        bookMap.put(book5, book5);
//        bookMap.put(null, null); comparator will caues NPE exception to occur here.
    }

    public void getBooks() {
        Set<Map.Entry<Book, Book>> entries = bookMap.entrySet();
        List<Map.Entry<Book, Book>> entries1 = new ArrayList<Map.Entry<Book, Book>>();
        entries1.addAll(entries);
        Collections.sort(entries1, new SortMapComparator(SortOrder.NAME.ordinal()));
        for (Map.Entry e : entries1) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.getBooks();
    }

    public enum SortOrder {
        CODE(0),
        NAME(1),
        AUTH(2),
        PUBDATE(3);

        SortOrder(int i) {

        }
    }
}
