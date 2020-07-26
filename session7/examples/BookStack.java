import java.util.Stack;

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

public class BookStack {
	
	public static void main(String[] args) {
		Stack<Book> books = new Stack<Book>();
		books.push(new Book ("The Glass Hotel", 281));
		books.push(new Book ("The Mirror and the Light", 489));
		books.peek().read();
		books.push(new Book ("Uncanny Valley", 255));
		books.peek().read();
		books.pop();
		books.pop();
		books.peek().read();
		books.pop();
	}
}
