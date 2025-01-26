package Concurrency.Practice;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World, this is me from the thread"+ Thread.currentThread().getName());
    }
}
