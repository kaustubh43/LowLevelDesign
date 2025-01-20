package Concurrency;

public class ThreadException {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
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

        // start t1 which is defined above.
        t1.start();

        try {
            Thread.sleep(4000);
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}