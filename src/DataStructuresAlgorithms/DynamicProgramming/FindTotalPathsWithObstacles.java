package DataStructuresAlgorithms.DynamicProgramming;

import java.util.Arrays;

public class FindTotalPathsWithObstacles {
    /*
    A) 1 represents unblocked.
    B) 0 represents blocked.
     */
    public static int[][] dp;
    public static int findWays(int[][] A){
        int N =  A.length, M =  A[0].length;
        dp = new int[N][M];

        // Fill in the dp 2D array with -1.
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return ways(A, N - 1, M - 1);
    }

    public static int ways(int[][] A, int i, int j){
        if(i < 0 || j < 0){ // Invalid index.
            return 0;
        }
        if(A[i][j] == 0){ // Obstacle.
            return dp[i][j] = 0;
        }
        if(i == 0 && j == 0){ // (0, 0) position
            return 1;
        }
        if(dp[i][j] == -1){
            int up = ways(A, i, j - 1);
            int left = ways(A, i - 1, j);

            dp[i][j] = up + left;
        }
        return dp[i][j];
    }


    public static void main(String[] args) {
        int[][] mat1 = {{1, 1, 1},
                        {0, 0, 1},
                        {1, 1, 1}};
        System.out.println(findWays(mat1));

        int[][] mat2 = {{1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}};
        System.out.println(findWays(mat2));

        int[][] mat3 = {{1, 1, 1},
                        {1, 1, 0},
                        {1, 1, 1}};
        System.out.println(findWays(mat3));
    }
}
