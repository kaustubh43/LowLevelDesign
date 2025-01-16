package Concurrency.AdderSubtractorSolution;

public class Count {
    public int count;

    public synchronized void increment(){
        this.count++;
    }

    public synchronized void decrement(){
        this.count--;
    }

    public int getCount(){
        return this.count;
    }
}
