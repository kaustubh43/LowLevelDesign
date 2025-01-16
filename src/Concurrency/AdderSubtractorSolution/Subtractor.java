package Concurrency.AdderSubtractorSolution;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            count.decrement();
        }
    }
}
