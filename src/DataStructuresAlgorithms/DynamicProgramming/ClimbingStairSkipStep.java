package DataStructuresAlgorithms.DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairSkipStep {
    static int[] dp;
    public static int  climbStairs(int N, int skip) {
        dp = new int[N + 1];
        Arrays.fill(dp, -1);
        return solve(N, skip);
    }

    public static int solve(int N, int skip) {
        if (N < 0)
            return 0;
        if (N == skip)
            return dp[skip] = 0;
        if (N == 0)
            return dp[0] = 1;
        if (N == 1)
            return dp[1] = 1;

        if(dp[N] != -1)
            return dp[N];

        return dp[N] = solve(N - 1, skip) + solve(N - 2, skip);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3, 1));
    }
}
