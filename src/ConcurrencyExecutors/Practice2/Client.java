package ConcurrencyExecutors.Practice2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Future<Integer> future = executor.submit(() -> 2 + 3);
        Integer result = future.get();
        System.out.println(result);
        executor.shutdown();

        ArrayList<Integer> a = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(a);
    }
}
