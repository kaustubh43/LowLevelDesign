package Concurrency.Practice;

public class NumberPrinter implements Runnable {
    private int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.printf("%d printed by %s \n", i, Thread.currentThread().getName());
    }
}
