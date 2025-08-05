package DataStructuresAlgorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortArray {
    public void mergeSort(ArrayList<Integer> A){
        this.sort(A, 0, A.size() - 1);
    }

    private ArrayList<Integer> sort(ArrayList<Integer> A, int s, int e) {
        if(A.size() == 1) return A;
        if(s < e){
            int mid = s + (e - s) / 2;
            ArrayList<Integer> first = sort(A, s, mid);
            ArrayList<Integer> second = sort(A, mid + 1, e);

            ArrayList<Integer> merged = new ArrayList<>();
            int M = first.size(), N = second.size();
            int i = 0, j = 0;
            while(i < M && j < N){
                if(first.get(i) <= second.get(j)){
                    merged.add(first.get(i++));
                } else {
                    merged.add(second.get(j++));
                }
            }
            while(i < M){
                merged.add(first.get(i++));
            }
            while(j < N){
                merged.add(second.get(j++));
            }
            return merged;
        }
        return new ArrayList<>();
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, 7, 4, 3, 1));
        new MergeSortArray().mergeSort(A);
        System.out.println(A);
    }
}
