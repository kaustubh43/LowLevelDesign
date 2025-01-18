package DesignPrinciples.LSP.Solution;

public class Pigeon implements Flyable, Audible{
    @Override
    public void makeSound() {
        System.out.println("Gutarguu");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon flies");
    }
}
