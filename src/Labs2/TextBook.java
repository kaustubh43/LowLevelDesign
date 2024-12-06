package Labs2;

public class TextBook extends Book {
    private String subject;
    private int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title :: " + this.getTitle());
        System.out.println("ISBN :: " + this.getIsbn());
        System.out.println("Author :: " + this.getAuthor());
        System.out.println("Subject :: " + this.subject);
        System.out.println("Edition :: " + this.edition);
    }
}
