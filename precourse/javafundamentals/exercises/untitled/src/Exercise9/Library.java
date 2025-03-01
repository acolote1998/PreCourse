package Exercise9;

/*

Create a Library class that contains:

A list of books.
Methods to add a book, remove a book, and list all available books (books that are not checked out).
A method that allows users to check out or return a book by its ISBN.

 */

import java.util.ArrayList;

public class Library {
    ArrayList<Book> BookList = new ArrayList<>();


    public void addBook(String title, String author, String ISBN, boolean isCheckedOut) {
        BookList.add(new Book(title, author, ISBN, isCheckedOut));
    }

    public void removeBook(Book book) {
        BookList.remove(book);
    }

    public void showAvailableBooks() {
        for (Book book : BookList) {
            if (!book.isCheckedOut()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void returnRentedBook(String ISBN) {
        for (Book book : BookList) {
            if (book.isCheckedOut() && book.getISBN().equals(ISBN)) {
                book.returnBook();
                System.out.println("Book returned");
            }
        }
    }

    public void rentBook(String ISBN) {
        for (Book book : BookList) {
            if (!book.isCheckedOut() && book.getISBN().equals(ISBN)) {
                book.rentBook();
                System.out.println("Book is now rented");
            }
        }
    }


}

