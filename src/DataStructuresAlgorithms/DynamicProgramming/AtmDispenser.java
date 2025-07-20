package DataStructuresAlgorithms.DynamicProgramming;

import java.util.Arrays;

public class AtmDispenser {
    public static int[] notes = {1, 5, 30, 50};

    public static int dispense(int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);
        return minimumNotes(amount, dp);
    }

    public static int minimumNotes(int amount, int[] dp){
        if(amount == 0){
            dp[0] = 0;
            return 0;
        }

        if(amount < 0) {
            return Integer.MAX_VALUE;
        }

        if(dp[amount] == -1){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < notes.length; i++){
                min = Math.min(min, minimumNotes(amount-notes[i], dp));
            }
            dp[amount] = min + 1;
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(dispense(9)); // 9 = 5 + 1 + 1 + 1 + 1
    }
}

// Reactive = stupid calls + smart base cases.
// Proactive = smart cals + stupid base cases.
