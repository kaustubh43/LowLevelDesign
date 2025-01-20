package DesignPrinciples.InterfaceSegregation.Problem;

public class Pigeon extends Bird{
    public Pigeon() {
        super();
    }

    @Override
    public void fly(){
        System.out.println("Pigeon flying");
    }

    @Override
    public void makeSound(){
        System.out.println("Pigeon Gutargoo");
    }
}

