package Concurrency.AdderSubtractorProblem;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100000; i++) {
            count.increment();
        }
    }
}
