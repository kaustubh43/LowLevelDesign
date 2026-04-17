package DesignPrinciples.InterfaceSegregation.practice;

public class Eagle extends Bird implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Americaaa");
    }

    @Override
    public void fly() {
        System.out.println("Eagles fly");
    }
}
