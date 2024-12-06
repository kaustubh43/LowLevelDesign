package Labs2;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    // Default constructor
    User(){
        this.userId = generateUserID();
    }

    // Parameterised constructor.
    User(String name, String contactInfo){
        this.userId = generateUserID();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Copy constructors
    public User(User other){
        this.userId = generateUserID();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

    public String getUserId(){
        return userId;
    }

    public String getUserName(){
        return this.name;
    }

    public void setUserName(String userName){
        this.userId = userName;
    }

    public String getContactInfo(){
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

    private static String generateUserID(){
        // Implementation is required.
        totalUsers++;
        return "User-" + totalUsers;
    }

    public abstract void returnBook();

}
