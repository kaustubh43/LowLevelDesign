package ConcurrencyExecutors.MergeSort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class MergeSorter implements Callable<ArrayList<Integer>> {
    private ArrayList<Integer> list;
    private ExecutorService executor;

    public MergeSorter(ArrayList<Integer> list, ExecutorService executor) {
        this.list = list;
        this.executor = executor;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        return null;
    }
}
