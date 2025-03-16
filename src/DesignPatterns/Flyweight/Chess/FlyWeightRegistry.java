package DesignPatterns.Flyweight.Chess;

public interface FlyWeightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}