package Concurrency.AdderSubtractorPractice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count(0);

        Adder adder = new Adder(c);
        Subtractor subtractor = new Subtractor(c);

        // Creating new thread objects.
        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        // Starting both the threads.
        adderThread.start();
        subtractorThread.start();

        System.out.println("started both the threads");

        // Waiting for the threads to finish execution.
        adderThread.join();
        subtractorThread.join();

        System.out.println(c.getCount());
    }
}
