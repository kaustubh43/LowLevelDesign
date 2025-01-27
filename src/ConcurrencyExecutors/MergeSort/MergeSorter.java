package ConcurrencyExecutors.MergeSort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<ArrayList<Integer>> {
    private final ArrayList<Integer> unsorted;
    private final ExecutorService executor;

    public MergeSorter(ArrayList<Integer> list, ExecutorService executor) {
        this.unsorted = list;
        this.executor = executor;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        return sortMerge();
    }

    private ArrayList<Integer> sortMerge() throws ExecutionException, InterruptedException {
        // 1. Find mid and break the array into 2 parts.
        // 2. Sort the two parts individually (recurse).
        // 3. Merge the sorted arrays together.
        System.out.printf("Sorting on thread %s\n", Thread.currentThread().getName());

        if(unsorted.size() <= 1){
            return unsorted;
        }
        // 1 ------
        int n = unsorted.size();
        int mid = n/2;

        ArrayList<Integer> leftUnsorted = new ArrayList<>(unsorted.subList(0, mid));    // [0, mid): left inclusive, right exclusive.
        ArrayList<Integer> rightUnsorted = new ArrayList<>(unsorted.subList(mid, n));     // [mid, n): left inclusive, right exclusive.

        // 2
        Future<ArrayList<Integer>> leftFuture = executor.submit(new MergeSorter(leftUnsorted, executor));
        Future<ArrayList<Integer>> rightFuture = executor.submit(new MergeSorter(rightUnsorted, executor));

        ArrayList<Integer> sortedArray = new ArrayList<>();
        ArrayList<Integer> leftSorted = leftFuture.get();
        ArrayList<Integer> rightSorted = rightFuture.get();

        int i = 0, j =  0;
        while (i < leftSorted.size() && j < rightSorted.size()) {
            if (leftSorted.get(i) < rightSorted.get(j)) {
                sortedArray.add(leftSorted.get(i));
                i++;
            }
            else {
                sortedArray.add(rightSorted.get(j));
                j++;
            }
        }
        // Add residual elements if rightSorted is exhausted.
        while(i < leftSorted.size()){
            sortedArray.add(leftSorted.get(i));
            i++;
        }
        // Add residual elements if leftSorted is exhausted.
        while(j < rightSorted.size()){
            sortedArray.add(rightSorted.get(j));
            j++;
        }

        return sortedArray;
    }
}
