package DesignPrinciples.InterfaceSegregation.Solution;

public class Penguin implements Sound {
    // Penguin does not implement flyable interface since it cannot fly.
    @Override
    public void makeSound() {
        System.out.println("Penguin makes sound");
    }
}
