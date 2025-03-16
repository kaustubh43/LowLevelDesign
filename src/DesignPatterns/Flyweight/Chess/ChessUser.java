package DesignPatterns.Flyweight.Chess;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ChessUser {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Colour colour;
    private int currentGameStreak;
    private Byte[] photo;
}
