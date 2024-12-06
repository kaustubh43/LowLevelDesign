package Labs2;

public class User {
    private String userId;
    private String name;
    private String contactInfo;

    // Default constructor
    public User(){
        this.userId = generateUserID();
    }

    // Parameterised constructor.
    public User(String name, String contactInfo){
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

    public static String generateUserID(){
        return "0";
    }

}
