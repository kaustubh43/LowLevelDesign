package Sorting;

public class MergeSort { // Main merge sort method
    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            // Find the mid
            int mid = left + (right - left) / 2;
            // Recursively sort the first half
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sort arr which is split as [left, mid] (mid, right]

        int n1 = mid - left + 1; // Size of left subarray
        int n2 = right - mid; // Size of right subarray

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];


        for(int i = 0; i < n1; i++) {
           leftArr[i] = arr[left + i];
        }

        for(int i = 0; i < n2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int k = left;
        int i = 0, j = 0;
        while(i < n1 && j <n2) {
            if(leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else{
                arr[k++] = rightArr[j++];
            }
        }
        while(i < n1) {
            arr[k++] = leftArr[i++];
        }
        while(j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    // Overloaded method for easier calling
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 88, 76, 50, 42};

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

        // Test with edge cases
//        int[] emptyArray = {};
//        int[] singleElement = {5};
//
//        int[] twoElements = {3, 1};
//
//        mergeSort(emptyArray);
//        mergeSort(singleElement);
//        mergeSort(twoElements);
//
//        System.out.println("Single element: ");
//        printArray(singleElement);
//        System.out.println("Two elements: ");
//        printArray(twoElements);
    }
}
