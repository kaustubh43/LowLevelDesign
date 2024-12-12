package Concurrency;

public class Concur {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
