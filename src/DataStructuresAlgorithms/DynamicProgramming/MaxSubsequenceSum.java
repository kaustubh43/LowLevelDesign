package DataStructuresAlgorithms.DynamicProgramming;

import java.util.Arrays;

public class MaxSubsequenceSum {
    public static int maxSubsequenceSum(int[] arr) {
        int N =  arr.length;
        int[] dp = new int[N];
        Arrays.fill(dp, -1);

        return maxSS(arr, dp, N - 1);
    }

    public static int maxSS(int[] arr, int[] dp, int end) {
        if(end < 0){
            return 0;
        }
        // Check if the result is cached
        if(dp[end] == -1){
            int include = maxSS(arr, dp, end - 2) + arr[end];
            int exclude = maxSS(arr, dp, end - 1);
            dp[end] = Math.max(include, exclude);
        }
        return dp[end];
    }

    public static void main(String[] args) {
        System.out.println(maxSubsequenceSum(new int[]{-5, 2, -7, 8}));
    }
}
