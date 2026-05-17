package DataStructuresAlgorithms.DynamicProgramming;

import java.util.Arrays;

class Solution {
    public static int solve(int N) {
        if(N <= 0) return 0;
        int [] dp = new int[N + 1];
        Arrays.fill(dp, -1);
        return fib(dp, N);
    }

    public static int fib(int[] dp, int N) {
        if(N == 1) return 0;
        if(N == 2) return 1;
        // Check if precomputed in dp array.
        if(dp[N] != -1) return dp[N];

        dp[N] = fib(dp, N - 1) + fib(dp, N - 2);
        return dp[N];
    }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
    // 0 1 1 2 3 5
}