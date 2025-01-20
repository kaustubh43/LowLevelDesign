package DesignPrinciples.InterfaceSegregation.Problem;

public class Penguin extends Bird{
    public Penguin() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin makes sound");
    }

    @Override
    public void fly() {
        // Penguin does not fly.
        // Do not want to implement any logic here. Hence, it is better to make fly and interface and
        // implement the interface where it is required.
        // Doing anything else does not add value, check Solution section.
    }
}
