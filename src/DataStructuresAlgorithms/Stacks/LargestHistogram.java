package DataStructuresAlgorithms.Stacks;

import java.util.Stack;

public class LargestHistogram {
    public static int largestRectangleArea(int[] A) {
        int N = A.length;
        int answer = Integer.MIN_VALUE;
        int BAR_WIDTH = 1;
        int[] NSER = NSER(A);
        int[] NSEL = NSEL(A);

        for(int i = 0; i < N; i++) {
            int current = A[i] * (NSER[i] - NSEL[i] - 1) * BAR_WIDTH;
            answer = Math.max(current, answer);
        }
        return answer;
    }

    public static int[] NSEL(int[] A) {
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < N; i++){
            int element = A[i];
            while(!st.isEmpty() && element <= A[st.peek()]){
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return result;
    }

    public static int[] NSER(int[] A){
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i = N - 1; i >= 0; i--){
            int element = A[i];
            while(!st.isEmpty() && element <= A[st.peek()]){
                st.pop();
            }
            result[i] = st.isEmpty() ? N : st.peek();
            st.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sample = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(sample));
    }
}