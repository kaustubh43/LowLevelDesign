package Labs2;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;

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

    public void displayDashboard(){

    }

    public boolean canBorrowBooks() {
        return false;
    }

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
        return "0";
    }

}
