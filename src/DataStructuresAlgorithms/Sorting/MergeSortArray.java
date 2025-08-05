package DataStructuresAlgorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortArray {
    public void mergeSort(ArrayList<Integer> A) {
        // Create a copy of the sorted result back to the original array
        ArrayList<Integer> sorted = sort(A, 0, A.size() - 1);
        A.clear();
        A.addAll(sorted);
    }

    private ArrayList<Integer> sort(ArrayList<Integer> A, int s, int e) {
        if (s > e) {
            return new ArrayList<>(); // Return empty array for invalid range
        }
        if (s == e) {
            // Return new ArrayList with a single element
            return new  ArrayList<>(Arrays.asList(A.get(s)));
//            ArrayList<Integer> base = new ArrayList<>();
//            base.add(A.get(s));
//            return base;
        }

        int mid = s + (e - s) / 2;
        // Recursively sort the left and right halves
        ArrayList<Integer> first = sort(A, s, mid);
        ArrayList<Integer> second = sort(A, mid + 1, e);

        // Merge the sorted halves
        return merge(first, second);
    }

    private ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        int M = A.size(), N = B.size();

        // Merge elements from both arrays in sorted order
        while (i < M && j < N) {
            if (A.get(i) <= B.get(j)) {
                merged.add(A.get(i++));
            } else {
                merged.add(B.get(j++));
            }
        }

        // Add remaining elements from A
        while (i < M) {
            merged.add(A.get(i++));
        }

        // Add remaining elements from B
        while (j < N) {
            merged.add(B.get(j++));
        }

        return merged;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, 7, 4, 3, 1));
        new MergeSortArray().mergeSort(A);
        System.out.println(A); // Output: [1, 3, 4, 5, 7]
    }
}