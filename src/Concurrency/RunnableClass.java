package Concurrency;

public class RunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.printf("I am here in RunnableClass :: %s", Thread.currentThread().getName());
    }
}
