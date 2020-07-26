package com.upgrad.ubank.utils;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public void read () {
        System.out.println("Reading '" + name + "' which has " + pages + " pages.");
    }
}

public class BookStoreIterateEnumeration {

    public static void iterateEnumerationVector () {
        Vector<Book> books = new Vector<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        Enumeration<Book> enumIterator = books.elements();
        while (enumIterator.hasMoreElements()) {
            enumIterator.nextElement().read();
        }
    }

    public static void iterateEnumerationStack () {
        Vector<Book> books = new Stack<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        Enumeration<Book> enumIterator = books.elements();
        while (enumIterator.hasMoreElements()) {
            enumIterator.nextElement().read();
        }
    }

    public static void main(String[] args) {
        iterateEnumerationVector();
        iterateEnumerationStack();
    }
}