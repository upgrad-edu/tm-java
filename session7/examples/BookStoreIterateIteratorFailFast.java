

import java.util.*;

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

public class BookStoreIterateIteratorFailFast {

    public static void iterateFailFast () {
        List<Book> books = new ArrayList<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            iterator.next().read();
            books.add(new Book("The City We Became", 366));
        }
    }

    public static void main(String[] args) {
        iterateFailFast();
    }
}