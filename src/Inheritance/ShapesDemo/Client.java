package Inheritance.ShapesDemo;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Client c = new Client();
        c.someMethod();

        int x = 10;
        Runnable r = () -> System.out.println(x);
        Thread t1 = new Thread(r);
        t1.start();
        t1.wait();
    }

    public static void someMethod(){
        System.out.println("Hello World");
    }
}
