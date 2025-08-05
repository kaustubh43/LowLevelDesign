package DataStructuresAlgorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortArray {
    private void sort(ArrayList<Integer> list) {
        ArrayList<Integer> sort = this.mergeSort(list, 0, list.size() - 1);
        list.clear();
        list.addAll(sort);
    }

    private ArrayList<Integer> mergeSort(ArrayList<Integer> list, int s, int e) {
        if(s > e){
            return new ArrayList<>();
        }

        if(s == e){
            return new ArrayList<>(Arrays.asList(list.get(s)));
        }

        int mid = s + (e - s) / 2;

        ArrayList<Integer> first = mergeSort(list, s, mid);
        ArrayList<Integer> second = mergeSort(list, mid + 1, e);

        return mergeTwoSortedArrays(first, second);
    }

    private ArrayList<Integer> mergeTwoSortedArrays(ArrayList<Integer> first, ArrayList<Integer> second) {
        int i = 0, j = 0, M = first.size(), N =  second.size();
        ArrayList<Integer> result = new ArrayList<>(M);

        while(i < M && j < N){
            if(first.get(i) <= second.get(j)){
                result.add(first.get(i++));
            }
            else{
                result.add(second.get(j++));
            }
        }
        while(i < M)
            result.add(first.get(i++));

        while(j < N)
            result.add(second.get(j++));

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 7, 4, 3, 1));

        new MergeSortArray().sort(list);
        System.out.println(list);
    }
}