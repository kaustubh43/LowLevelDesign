package DesignPatterns.Flyweight.Chess;

public class Main {
    static FlyWeightRegistry registry = new FlyWeightRegistryImpl();

    public static void main(String[] args) {
        Byte[] bytes = new Byte[10];
        UserIntrinsicState kaustubh = createUser("Kaustubh", 26, "Male", "kaustubh@org.com", "9000000000", bytes);


        // kaustubh enters game1.
        addToGame(Colour.BLACK, 0, "kaustubh@org.com");
        addToGame(Colour.WHITE, 0, "kaustubh@org.com");
        System.out.println(kaustubh);
        System.out.println(registry.getFlyweight("kaustubh@org.com"));
    }

    public static UserIntrinsicState createUser(String name, int age, String gender, String email, String phonenumber, Byte[] photo){
        UserIntrinsicState user = UserIntrinsicState.builder()
                .name(name)
                .age(age)
                .gender(gender)
                .email(email)
                .phoneNumber(phonenumber)
                .photo(photo)
                .build();
        registry.addFlyweight(user);
        return user;
    }

    public static void addToGame(Colour colour, int currentGameStreak, String email){
        UserExtrinsicState userGame1 = UserExtrinsicState.builder()
                .colour(Colour.BLACK)
                .currentGameStreak(0)
                .user(registry.getFlyweight(email))
                .build();
        System.out.println("Added to Game");
    }
}
// 953 user intrinsic, should not change.
// Registry: 841
// userGame1: 840 -> 959 ->