package Exercise9;

/*

A name property (String).
A list of books they have checked out.
Methods to check out a book and return a book.
Interaction between classes: Ensure that users can only check out a book if it is available (not checked out already).

 */

import java.util.ArrayList;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(ArrayList<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    private String name;
    private ArrayList<Book> rentedBooks;

    public void rentBook(String ISBN, ArrayList<Book> availableBooksForRent) {
        for (Book book : availableBooksForRent) {
            if (book.getISBN().equals(ISBN)) {
                rentedBooks.add(book);
                System.out.println("Book rented");

            }
        }
    }

    public void returnBook(String ISBN, ArrayList<Book> libraryBooksArrayList) {
        for (Book book : libraryBooksArrayList) {
            if (book.getISBN().equals(ISBN)) {
                book.setCheckedOut(false);
                System.out.println("Book successfully returned");
            }
        }
    }
}
