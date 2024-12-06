package Labs2;

public interface Lendable {
    public boolean lend(User user);
    public void returnBook(User user);
    public boolean isAvailable();
}
