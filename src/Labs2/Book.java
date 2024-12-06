package Labs2;

public abstract class Book implements Lendable{
    String isbn;
    String title;
    String author;
    boolean isAvailable;

    @Override
    public boolean lend(User user) {
        if(this.isAvailable){
            isAvailable = false;
            return true;
        }
        else
            return false;
    }

    @Override
    public void returnBook(User user) {
        this.isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public void displayBookDetails(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}
