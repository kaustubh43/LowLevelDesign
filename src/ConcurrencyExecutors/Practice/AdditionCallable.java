package ConcurrencyExecutors.Practice;

import java.util.concurrent.Callable;

public class AdditionCallable implements Callable<Integer> {
    int a;
    int b;

    public AdditionCallable(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        System.out.printf("Summing %d + %d = %d by thread::\n", a, b, a + b, Thread.currentThread().getName());
        return a + b;
    }
}
