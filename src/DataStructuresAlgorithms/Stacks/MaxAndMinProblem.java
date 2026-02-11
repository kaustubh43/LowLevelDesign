package DataStructuresAlgorithms.Stacks;

import java.util.Stack;

public class MaxAndMinProblem {
    public static int solve(int[] A) {
        final int MOD = 1000000007;
        long sum = 0L;
        int N = A.length;
        int[] NSEL = NSEL(A);
        int[] NGEL = NGEL(A);
        int[] NSER = NSER(A);
        int[] NGER = NGER(A);

        for(int i = 0; i < N; i++) {
            // Find where A[i] is maximum.
            int leftMax = i - NGEL[i];
            int rightMax = NGER[i] - i;
            long totalMax = (long) leftMax * rightMax;
            // Find where A[i] is minimum.
            int leftMin = i - NSEL[i];
            int rightMin = NSER[i] - i;
            long totalMin = (long) leftMin * rightMin;
            long contribution = totalMax - totalMin;
            sum = (sum + A[i] * contribution) % MOD;
        }
        return (int) ((sum + MOD) % MOD);
    }

    public static int[] NSEL(int[] A) {
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < N; i++) {
            int element = A[i];
            while(!st.isEmpty() && element <= A[st.peek()]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return result;
    }

    public static int[] NGEL(int[] A) {
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < N; i++){
            int element = A[i];
            while(!st.isEmpty() && element >= A[st.peek()]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return result;
    }

    public static int[] NSER(int[] A) {
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i = N - 1; i >= 0; i--) {
            int element = A[i];
            while(!st.isEmpty() && element <= A[st.peek()]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? N : st.peek();
            st.push(i);
        }
        return result;
    }

    public static int[] NGER(int[] A) {
        int N = A.length;
        int[] result = new int[N];
        Stack<Integer> st = new Stack<>();

        for(int i = N - 1; i >= 0; i--){
            int element = A[i];
            while(!st.isEmpty() && element >= A[st.peek()]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? N : st.peek();
            st.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sample = {2, 5, 3};
        System.out.println(solve(sample));
    }
}
