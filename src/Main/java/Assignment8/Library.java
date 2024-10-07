package Assignment8;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Method to add books to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }

    // Method to find a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The God of Small Things", "Arundhati Roy", 500, 1997);
        EBook ebook1 = new EBook("Gitanjali", "Rabindranath Tagore", 350, 1910, 2.4);

        library.addBook(book1);
        book1.read();
        book1.getSummary();
        System.out.println("Discounted Price \t: \u20B9"+book1.discountedPrice(10)+"\n");
        System.out.println();

        library.addBook(ebook1);
        ebook1.read();
        ebook1.getSummary();
        System.out.println("Discounted Price \t: \u20B9"+ebook1.discountedPrice(10)+"\n");

        library.displayAllBooks();

        Book foundBook = library.findBookByTitle("Gitanjali");
        if (foundBook != null) {
            System.out.println("Book found:");
            foundBook.displayInfo();
        } else {
            System.out.println("Book not found.");
        }
    }
}