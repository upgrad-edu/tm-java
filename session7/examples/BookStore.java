import java.util.Vector;

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

public class BookStore {
	public static void main(String[] args) {
		Vector<Book> books = new Vector<Book>();
		books.add(new Book ("The Glass Hotel", 281));
		books.add(new Book ("The Mirror and the Light", 489));
		books.add(new Book ("Uncanny Valley", 255));
		
		for (Book book: books) {
			book.read();
		}
	}
}
