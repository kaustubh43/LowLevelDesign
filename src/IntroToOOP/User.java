package IntroToOOP;

public class User {
    public String name;
    private String password;
    String email;

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(User other){
        this.name = other.name;
        this.password = other.password;
        this.email = other.email;
    }
}
