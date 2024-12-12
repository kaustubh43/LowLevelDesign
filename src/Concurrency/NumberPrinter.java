package Concurrency;

public class NumberPrinter implements Runnable {
    private final int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.printf("%d printed by thread - %s \n", i, Thread.currentThread().getName());
    }
}
