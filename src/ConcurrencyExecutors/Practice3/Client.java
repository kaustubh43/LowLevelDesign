package ConcurrencyExecutors.Practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Integer>> results = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            AdditionCallable callable = new AdditionCallable(i, i + 1);
            Future<Integer> future = executorService.submit(callable);
            results.add(future);
        }

        for(int i = 0; i < results.size(); i++){
            try {
                System.out.println("Result of addition " + i + ": " + results.get(i).get());
            } catch (Exception e) {
                System.err.println("Error retrieving result for addition " + i + ": " + e.getMessage());
            }
        }

        executorService.shutdown();
    }
}
