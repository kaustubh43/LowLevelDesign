package ConcurrencyExecutors.MergeSortPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.*;

public class MergeSorter implements Callable<ArrayList<Integer>> {
    ArrayList<Integer> list;
    ExecutorService executorService;

    public MergeSorter(ArrayList<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }


    @Override
    public ArrayList<Integer> call() throws Exception {
        return mergeSort(list);
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> list) throws ExecutionException, InterruptedException {
        if(list.size() <= 1){
            return list;
        }

        // Find the mid index to split the list into two halves.
        // Sort the left and right halves recursively.
        // Merge the halves.
        int mid = list.size() / 2;

        ArrayList<Integer> leftArray = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> rightArray = new ArrayList<>(list.subList(mid, list.size()));

        // Recursively sort the left and right halves.
        Future<ArrayList<Integer>> leftFuture = executorService.submit(new MergeSorter(leftArray, executorService));
        Future<ArrayList<Integer>> rightFuture = executorService.submit(new MergeSorter(rightArray, executorService));

        ArrayList<Integer> leftSorted = leftFuture.get();
        ArrayList<Integer> rightSorted = rightFuture.get();

        ArrayList<Integer> sortedList = new ArrayList<>();

        int i = 0, j = 0;
        while(i < leftSorted.size() && j < rightSorted.size()){
            if(leftSorted.get(i) <= rightSorted.get(j)){
                sortedList.add(leftSorted.get(i++));
            }
            else{
                sortedList.add(rightSorted.get(j++));
            }
        }
        while(i < leftSorted.size()){
            sortedList.add(leftSorted.get(i++));
        }
        while(j < rightSorted.size()){
            sortedList.add(rightSorted.get(j++));
        }

        return sortedList;
    }
}
