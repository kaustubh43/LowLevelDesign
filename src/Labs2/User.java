package Labs2;

public class User {
    private String userId;
    private String name;
    private String contactInfo;

    public User(){
        this.userId = "";
        this.name = "";
        this.contactInfo = "";
    }

    public String getUserName(){
        return this.name;
    }

    public void setUserName(String userId){
        this.userId = userId;
    }

    public String getContactInfo(){
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }

}
