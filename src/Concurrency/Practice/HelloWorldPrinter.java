package Concurrency.Practice;

public class HelloWorldPrinter {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Thread Name: %s \nThread Priority %s \n", Thread.currentThread().getName(), Thread.currentThread().getPriority());
        for(int i = 0; i < 10; i++){
            Thread t1 = new Thread(new RunnableClass());
            t1.start();

            t1.join();
            foo();
        }
    }
    public static void foo() {
        System.out.printf("Hello World by %s \n", Thread.currentThread().getName());
    }
}
