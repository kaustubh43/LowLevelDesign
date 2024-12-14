package Labs2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<User> registeredUsers;
    private List<Book> bookInventory;
    private String libraryName;
    private String location;

    public LibraryManagementSystem() {
        registeredUsers = new ArrayList<>();
        bookInventory = new ArrayList<>();
    }

    // Parameterised constructor
    public LibraryManagementSystem(String libraryName, String location) {
        registeredUsers = new ArrayList<>();
        bookInventory = new ArrayList<>();
        this.libraryName = libraryName;
        this.location = location;
    }

    // Copy constructor
    public LibraryManagementSystem(LibraryManagementSystem otherLibrary){
        registeredUsers = new ArrayList<>();
        bookInventory = new ArrayList<>();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void addUser(User user) {
        registeredUsers.add(user);
    }

    public void addBook(Book book) {
        bookInventory.add(book);
        System.out.printf("Book Added: %s \n", book.getTitle());
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public List<Book> getBookInventory() {
        return bookInventory;
    }

    // Checks for matching title or author.
    public List<Book> searchBook(String criteria) {
        List<Book> searchedBooks = new ArrayList<>();
        for (Book book : bookInventory) {
            if (book.getTitle().toLowerCase().contains(criteria.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(criteria.toLowerCase())) {
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
