package DesignPrinciples.InterfaceSegregation.Solution;

public class Pigeon implements Flyable, Sound {

    @Override
    public void makeSound() {
        System.out.println("Gutarguu");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon flies");
    }
}
