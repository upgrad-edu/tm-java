import java.util.*;

class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return name + ": " + pages;
    }
}

public class BookSorter {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("Uncanny Valley", 255));

        System.out.println("Sorted by name");
        books.sort(Comparator.comparing(Book::getName));
        for (Book book: books) System.out.println(book);

        System.out.println();

        System.out.println("Sorted by name then number of pages");
        books.sort(Comparator.comparing(Book::getName).thenComparing(Book::getPages));
        for (Book book: books) System.out.println(book);
    }
}
