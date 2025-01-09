package Inheritance.demo;

public class Client {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.makeSound();
        tommy.makeSound(3);
        tommy.makeSound("MeowBark");
    }
}
