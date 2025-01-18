package DesignPrinciples.LSP.Solution;

public class Penguin implements Audible{

    @Override
    public void makeSound() {
        System.out.println("Penguin makes sound");
    }
}
