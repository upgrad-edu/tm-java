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

public class BookQueueAndDeque {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book ("The Glass Hotel", 281));
        books.add(new Book ("The Mirror and the Light", 489));
        books.add(new Book ("Uncanny Valley", 255));

        Queue<Book> queue = new LinkedList<>();
        Deque<Book> stack = new ArrayDeque<>();

        for (Book book: books) {
            queue.offer(book);
            stack.offerFirst(book);
        }

        System.out.println("Iterating Queue");
        while (queue.peek() != null) {
            queue.poll().read();
        }
        System.out.println();

        System.out.println("Iterating Deque");
        while (stack.peekFirst() != null) {
            stack.pollFirst().read();
        }
        System.out.println();
    }
}
