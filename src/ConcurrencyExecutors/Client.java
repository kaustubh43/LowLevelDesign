package ConcurrencyExecutors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<ArrayList<Integer>> future = executor.submit(new ArrayCreator(10));

        ArrayList<Integer> result = future.get();

        System.out.println(result);
    }
}
