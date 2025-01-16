package Concurrency.AdderSubtractorProblem;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        // Make a count object
        Count count  = new Count();

        // Make an adder object and pass count to the constructor.
        Adder adder = new Adder(count);
        // Make a Subtractor object and pass count to the constructor.
        Subtractor subtractor = new Subtractor(count);

        // create threads for adder and subtractor.
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        // start both the threads.
        t1.start();
        t2.start();

        // Wait for the threads to finish execution.
        t1.join();
        t2.join();

        System.out.println(count.getCount());
    }
}
