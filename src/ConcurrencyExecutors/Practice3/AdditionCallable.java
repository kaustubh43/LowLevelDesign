package ConcurrencyExecutors.Practice3;

import lombok.AllArgsConstructor;

import java.util.concurrent.Callable;

@AllArgsConstructor
public class AdditionCallable implements Callable<Integer> {
    int a, b;

    @Override
    public Integer call() throws Exception {
        System.out.println("Summing " + a + " + " + b + " = " + (a + b) + " by thread: " + Thread.currentThread().getName());
        return a + b;
    }
}
