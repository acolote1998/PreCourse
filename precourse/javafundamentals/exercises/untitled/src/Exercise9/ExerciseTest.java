package Exercise9;

public class ExerciseTest {
    public static void main(String[] args) {
        // Create a Library
        Library myLibrary = new Library();

        // Add some books to the library
        myLibrary.addBook("The Great Gatsby", "F. Scott Fitzgerald", "12345", false);
        myLibrary.addBook("1984", "George Orwell", "67890", false);
        myLibrary.addBook("To Kill a Mockingbird", "Harper Lee", "11223", false);

        // Show available books
        System.out.println("Available books:");
        myLibrary.showAvailableBooks();

        // Create a User
        User user1 = new User("John Doe");


        // Rent a book
        System.out.println("\nJohn is renting '1984':");
        user1.rentBook("67890", myLibrary.BookList);

        // Show available books after renting
        System.out.println("\nAvailable books after renting '1984':");
        myLibrary.showAvailableBooks();

        // Try to rent the same book again
        System.out.println("\nJohn is trying to rent '1984' again:");
        user1.rentBook("67890", myLibrary.BookList);

        // Return the rented book
        System.out.println("\nJohn is returning '1984':");
        user1.returnBook("67890", myLibrary.BookList);

        // Show available books after returning
        System.out.println("\nAvailable books after returning '1984':");
        myLibrary.showAvailableBooks();
    }

}
