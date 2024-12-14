package Labs2;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem("Kaustubh's Books", "Goa");

        // Adding Librarians.
        lms.addUser(new Librarian("Utsav", "90XXXXXXXX", "1"));
        lms.addUser(new Librarian("Eshani", "90XXXXXXXX", "2"));
        lms.addUser(new Member("Rutwik", "90XXXXXXXX"));

        // Adding Novel: Books
        lms.addBook(new NovelBook("1000", "Harry Putter",
                "JK Rowdy", "Magic", 1, "Fiction"));
        lms.addBook(new NovelBook("1001", "Harry Putter and Prisoner of Azkaban",
                "JK Rowdy", "Magic", 2, "Fiction"));
        lms.addBook(new TextBook("1001", "Physics",
                "HC Verma", "Quantum Physics", 2));

//        List<User> users = lms.getRegisteredUsers();
//        for(User u : users){
//            System.out.println(u.getUserName() + "::" + u);
//        }
//        List<Book> books = lms.getBookInventory();
//        for(Book b : books){
//            System.out.println(b.getTitle() + "::" + b);
//        }
        System.out.println("Finding Books");
        List<Book> findBooks= lms.searchBook("Harry");
        for (Book book : findBooks) {
            System.out.println(book.getTitle() + "::" + book.getAuthor());
        }

    }
}
