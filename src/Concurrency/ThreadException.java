package Concurrency;

public class ThreadException {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("Task completed.");
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted while sleeping.");
                }
            }
        });


        thread.start();


        try {
            Thread.sleep(5001);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}