package Labs2;

public class Librarian extends User{
    private String employeeNumber;

    public Librarian() {
        super();
    }

    public Librarian(String employeeNumber) {
        super();
        this.employeeNumber = employeeNumber;
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }


    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Name" + this.getUserName());
        System.out.println("Employee:: " + this.getUserName() + " has an employee number " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        // Librarians can have all time access to all books.
        return true;
    }

    @Override
    public void returnBook() {
        // Return book.
        System.out.println("Librarian Returned");
    }

    public void addBook(String bookName) {
        // Pass, can further add this
        System.out.println("Book Added");
    }

    public void removeBook(String bookName) {
        // Pass, can further extend this
        System.out.println("Book Removed");
    }
}
