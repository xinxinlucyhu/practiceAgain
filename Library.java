import java.util.ArrayList;
import java.util.List;

public class Library {

	private String address;
	private List<Book> books = new ArrayList<>();

	public Library(String address) {
		this.address = address;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void borrowBook(String title) {

		for (int i = 0; i < books.size(); i++) {
			String name = books.get(i).getTitle();
			Book book = books.get(i);
			if (name.equals(title)) {
				if (!book.isBorrowed()) {
					System.out.println("You successfully borrowed " + name);
					books.get(i).borrowed();
				} else if (book.isBorrowed()) {
					System.out.println("Sorry, this book is already borrowed.");
				}
				return;
			}

		}
		System.out.println("Sorry, this book is not in our catalog. ");
	}

	public void printAvailableBooks() {
//System.out.println(books.stream().filter(b -> !b.isBorrowed()).map(Book::getTitle).reduce("No Books Available", (str,b) -> "No Books Available".equals(str) ? b : str + "\n" + b, (str, str2) -> "?"));

		List<Book> borrowedBooks = new ArrayList<>();
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			String name = books.get(i).getTitle();
			if (!book.isBorrowed()) {
				System.out.println(name);
			} else if (book.isBorrowed()) {
				borrowedBooks.add(book);
			}
		}
		if (books.size() == borrowedBooks.size() && books.size() != 0) {
			System.out.println("All Books are borrowed.");
		}
		if (books.size() == 0) {
			System.out.println("No book in catalog.");
		}
	}

	public void returnBook(String title) {
		for (int i = 0; i < books.size(); i++) {
			String name = books.get(i).getTitle();
			Book book = books.get(i);
			if (name.equals(name)) {
				if (book.isBorrowed()) {
					System.out.println("You successfully returned " + name);
					books.get(i).returned();
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));

		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}

}
