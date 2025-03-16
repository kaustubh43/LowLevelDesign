package DesignPatterns.Flyweight.Chess;


import lombok.Builder;
import lombok.Getter;

@ExtrinsicState
@Getter
@Builder
public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState user;
}
