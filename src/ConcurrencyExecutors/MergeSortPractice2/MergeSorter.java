package ConcurrencyExecutors.MergeSortPractice2;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<ArrayList<Integer>> {
    ArrayList<Integer> list;
    ExecutorService executorService;

    public MergeSorter(ArrayList<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        return this.mergeSort(this.list);
    }

    private ArrayList<Integer> mergeSort(ArrayList<Integer> list) throws ExecutionException, InterruptedException {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;

        // Split Array.
        ArrayList<Integer> leftArray = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> rightArray = new ArrayList<>(list.subList(mid, list.size()));

        // Submit tasks for sorting left and right subarrays recursively.
        Future<ArrayList<Integer>> leftFuture = executorService.submit(new MergeSorter(leftArray, executorService));
        Future<ArrayList<Integer>> rightFuture = executorService.submit(new MergeSorter(rightArray, executorService));

        // Get the sorted subarrays from Futures.
        ArrayList<Integer> leftSorted = leftFuture.get();
        ArrayList<Integer> rightSorted = rightFuture.get();

        // Merge the sorted subarrays.
        int i = 0;
        int j = 0;
        ArrayList<Integer> sortedList = new ArrayList<>();
        while (i < leftSorted.size() && j < rightSorted.size()) {
            if (leftSorted.get(i) < rightSorted.get(j)) {
                sortedList.add(leftSorted.get(i++));
            } else {
                sortedList.add(rightSorted.get(j++));
            }
        }
        while (i < leftSorted.size()) {
            sortedList.add(leftSorted.get(i++));
        }
        while (j < rightSorted.size()) {
            sortedList.add(rightSorted.get(j++));
        }
        return sortedList;
    }
}
