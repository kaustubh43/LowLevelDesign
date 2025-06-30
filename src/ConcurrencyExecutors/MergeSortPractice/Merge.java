package ConcurrencyExecutors.MergeSortPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Merge {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Integer> list = new ArrayList<>(List.of(9, 4, 6, 0, 8, 1, 2, 3, 7, 5));

        MergeSorter sorter = new MergeSorter(list, executorService);

        Future<ArrayList<Integer>> futureList = executorService.submit(sorter);

        ArrayList<Integer> sortedList = null;
        try {
            sortedList = futureList.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sorted List: " + sortedList);
    }
}
