package Concurrency.AdderSubtractorPractice2;

public class Count {
    int i;

    public synchronized void increment(){
        this.i++;
    }

    public synchronized void decrement(){
        this.i--;
    }

    public int getCount() {
        return i;
    }
}
