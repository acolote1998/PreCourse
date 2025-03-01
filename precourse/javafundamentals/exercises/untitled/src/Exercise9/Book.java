package Exercise9;

/*

Create a Book class with the following properties:

title (String)
author (String)
ISBN (String)
isCheckedOut (boolean)
A method to mark a book as checked out and another to check it back in.

 */

public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    private String title;
    private String author;
    private String ISBN;
    private boolean isCheckedOut;

    public Book(String title, String author, String ISBN, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isCheckedOut = isCheckedOut;
    }

    public void rentBook() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

}
