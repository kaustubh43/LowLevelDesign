package Concurrency.AdderSubtractorPractice;

public class Count {
    private int count;

    public Count(int count) {
        this.count = count;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
