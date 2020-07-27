import java.util.HashSet;
import java.util.Set;

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

    @Override
    public int hashCode() {
        return name.hashCode() + pages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            return this.getName().equals(book.getName()) && this.getPages() == book.getPages();
        }
        return false;
    }
}

public class BookSet {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<Book>();
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("Uncanny Valley", 255));

        for (Book book: books) {
            System.out.println(book);
        }

    }
}
