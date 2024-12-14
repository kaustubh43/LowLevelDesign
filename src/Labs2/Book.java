package Labs2;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // Add default constructors.

    // Add copy constructors.

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;   // International Standard Book Number
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user) {
        if(this.isAvailable && user.canBorrowBooks()){  // make more precise.
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        this.isAvailable = true;
        user.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public abstract void displayBookDetails();
}
