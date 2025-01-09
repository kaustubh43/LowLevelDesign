package Inheritance.demo;

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }

    public void makeSound(int N){
        for(int i=0;i<N;i++){
            System.out.println("Bark" + (i+1));
        }
    }

    public void makeSound(String customSound){
        System.out.println(customSound);
    }
}
