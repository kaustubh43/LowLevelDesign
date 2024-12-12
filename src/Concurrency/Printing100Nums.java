package Concurrency;

public class Printing100Nums {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 1; i <= 100; i++) {
//            System.out.println(i);
//            System.out.println(Thread.currentThread().getName());     // Prints using one thread only, main thread.
            Thread thread = new Thread(new NumberPrinter(i));
            thread.start();
            System.out.println("Hello world");  // Prints using main thread.
        }

        Thread thread = new Thread(new RunnableClass());
        thread.start();
    }
}
