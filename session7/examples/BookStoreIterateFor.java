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

public class BookStoreIterateFor {

    public static void iterateArrayList () {
        List<Book> books = new ArrayList<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        for (int i=0; i<books.size(); i++) {
            books.get(i).read();
        }
    }

    public static void iterateLinkedList () {
        List<Book> books = new LinkedList<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        for (int i=0; i<books.size(); i++) {
            books.get(i).read();
        }
    }

    public static void iterateVector () {
        List<Book> books = new Vector<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        for (int i=0; i<books.size(); i++) {
            books.get(i).read();
        }
    }

    public static void iterateStack () {
        List<Book> books = new Stack<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        for (int i=0; i<books.size(); i++) {
            books.get(i).read();
        }
    }

    public static void main(String[] args) {
        iterateArrayList();
        iterateLinkedList();
        iterateVector();
        iterateStack();
    }
}