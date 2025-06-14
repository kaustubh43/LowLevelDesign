package Concurrency.Practice2;

public class RunnableClassPrac2 implements Runnable{
    int i;

    public RunnableClassPrac2(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Printing" + i +" Thread: " + Thread.currentThread().getName());
    }
}
