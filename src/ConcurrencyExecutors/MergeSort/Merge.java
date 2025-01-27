package ConcurrencyExecutors.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Merge {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(9,4,6,0,8,1,2,3,7,5));

        MergeSorter ms = new MergeSorter(list, executor);
        System.out.println(executor.submit(ms).get());
    }
}
