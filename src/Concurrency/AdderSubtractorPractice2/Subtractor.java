package Concurrency.AdderSubtractorPractice2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subtractor implements Runnable{
    public Count count;

    @Override
    public void run() {
        for(int i=0;i<1000000;i++){
           count.decrement();
        }
    }
}
