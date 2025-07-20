package DataStructuresAlgorithms.PriorityQueue;

public class Heap {
    public int[] buildHeap(int[] A) {
        // code here
        int N = A.length;
        int[] heap = new int[N];
        int size = 0;

        for (int i = 0; i < N; i++) {
            insertHeap(heap, A[i], size);
            size++;
        }
        return heap;
    }

    public void insertHeap(int[] heap, int element, int size) {
        int i = size;
        heap[i] = element;

        while (i > 0) {
            int pi = (i - 1) / 2;
            if (heap[pi] >= heap[i]) {
                swap(heap, i, pi);
                i = pi;
            } else
                break;
        }
    }

    public int extractMin(int[] heap, int size) {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(heap, 0, size);
        return min;
    }

    private void heapifyDown(int[] heap, int i, int size) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(heap, i, smallest);
            heapifyDown(heap, smallest, size);
        }
    }

    public static void swap(int[] A, int one, int two) {
        int temp = A[one];
        A[one] = A[two];
        A[two] = temp;
    }
}