package Inheritance.Shapes;

public class Client {
    public static void main(String[] args) {
        Shape square = new Square();
        square.draw();
        display();
    }

    static void display(){
        System.out.println("Hello from Client class");
    }
}
