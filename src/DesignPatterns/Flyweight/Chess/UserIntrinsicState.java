package DesignPatterns.Flyweight.Chess;

import lombok.Builder;
import lombok.Getter;

@IntrinsicState
@Getter
@Builder
public class UserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;
}
