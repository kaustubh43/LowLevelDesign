package DataStructuresAlgorithms.DynamicProgramming;

import java.util.Arrays;

public class RodCutting {
    public static int bottomUp(int[] arr, int N){
        int[] dp = new int[N + 1];
        Arrays.fill(dp, 0);

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], arr[j-1] + dp[i - j]);
            }
        }
        return dp[N];
    }

    public static int topDown(int[] arr, int N){
        int[] dp = new int[N + 1];
        Arrays.fill(dp, -1);

        return topDownHelper(arr, dp, N);
    }

    private static int topDownHelper(int[] arr, int[] dp, int i) {
        if(i == 0){ // Rod of zero lengths, gives 0 profit
            return dp[0] = 0;
        }
        if(dp[i] != -1){ // Already memoized
            return dp[i];
        }
        for(int j = 1; j <= i; j++){ // Cut the rod.
            dp[i] = Math.max(dp[i], arr[j-1] + topDownHelper(arr, dp, i - j));
        }
        return dp[i];
    }

    public static void main(String[] args) {
        System.out.println(bottomUp(new int[]{1, 4, 2, 5, 6}, 5));
        System.out.println(topDown(new int[]{1, 4, 2, 5, 6}, 5));
    }
}
