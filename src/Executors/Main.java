package Executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

//        for(int i = 0; i < 100; i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executorService.submit(numberPrinter);
//        }

//        executorService.shutdown();

        List<Future<Integer>> sums = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            Addition addition = new Addition(i, i + 1);
            Future<Integer> future = executorService.submit(addition);
            sums.add(future);
        }

        for(int i = 0; i < 100; i++){
            System.out.println(sums.get(i).get());
        }

        executorService.shutdown();
    }
}
