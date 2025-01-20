package ConcurrencyExecutors.Practice;

import ConcurrencyExecutors.Addition;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);

        // Printing numbers by a fixed pool of threads
        for(int i = 0; i < 100; i++){
            NumberPrinter printer = new NumberPrinter(i);
            pool.submit(printer);
        }
        pool.shutdown();

        // Using callable, helps us in returning a value from the thread.
        System.out.println("Demo Callable with ExecutorService");
        List<Future<Integer>> sums = new ArrayList<Future<Integer>>();
        ExecutorService pool2 = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 100; i++){
            AdditionCallable additionCallable = new AdditionCallable(i, i + 1);
            Future<Integer> future= pool2.submit(additionCallable);
            sums.add(future);
        }
        pool2.shutdown();

        for(int i = 0; i < 100; i++){
            System.out.println(sums.get(i).get());
        }

    }
}
