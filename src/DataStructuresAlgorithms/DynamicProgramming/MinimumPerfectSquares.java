package DataStructuresAlgorithms.DynamicProgramming;

public class MinimumPerfectSquares {
    public static int countMinSquares(int A) {
        int[] dp = new int[A + 1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= A; i++){
            int currMin = Integer.MAX_VALUE;
            for(int k = 1; k * k <= i; k++){
                currMin = Math.min(currMin, dp[i - k * k]);
            }
            dp[i] = currMin + 1;
        }

        return dp[A];
    }

    public static void main(String[] args) {
        System.out.println(countMinSquares(7));
    }
}
