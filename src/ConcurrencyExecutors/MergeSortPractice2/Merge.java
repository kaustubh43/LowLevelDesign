package ConcurrencyExecutors.MergeSortPractice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Merge {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 18, 91, 81, 65, 1, 100));

        MergeSorter sorter = new MergeSorter(list, executorService);

        Future<ArrayList<Integer>> future = executorService.submit(sorter);

        try {
            ArrayList<Integer> sortedList = future.get();
            System.out.println("Sorted List: " + sortedList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
