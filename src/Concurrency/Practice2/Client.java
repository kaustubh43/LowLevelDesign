package Concurrency.Practice2;

public class Client {
    public static void main(String[] args) {
        System.out.printf("Client: Thread name %s and Thread Priority %s ", Thread.currentThread().getName(), Thread.currentThread().getPriority());
        for(int i = 0; i < 10; i++){
            Thread t1 = new Thread(new RunnableClassPrac2(i+1));
            System.out.println("Making a call from Thread: " + t1.getName());
            t1.start();
        }
    }
}
