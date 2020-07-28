import java.util.HashMap;
import java.util.Map;

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

public class BookMap {
    public static void main(String[] args) {
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("The Mirror and the Light", new Book ("The Mirror and the Light", 489));
        bookMap.put("Uncanny Valley", new Book ("Uncanny Valley", 255));
        bookMap.put("The Glass Hotel", new Book ("The Glass Hotel", 281));

        for (Map.Entry<String, Book> entry: bookMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
