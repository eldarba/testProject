package c;

import a.Book;
import a.BookStore;

public class Test {

	public static void main(String[] args) {
		BookStore store = new BookStoreDb();
		// add 3 books
		store.create(new Book(111, "Java 1", "Eldar", 100));
		store.create(new Book(222, "Java 2", "Amid", 150));
		store.create(new Book(333, "Java 3", "Eldar", 25));
		System.out.println("done");
	}
}
