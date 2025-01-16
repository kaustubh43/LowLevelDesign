package Concurrency.AdderSubtractorProblem;

public class Count {
    public int count;

    public void increment(){
        this.count++;
    }

    public void decrement(){
        this.count--;
    }

    public int getCount(){
        return this.count;
    }
}
