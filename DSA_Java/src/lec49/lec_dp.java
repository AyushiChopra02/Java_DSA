package lec49;

import java.util.Scanner;

public class lec_dp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int[] coins = new int[scn.nextInt()];
        
        for (int i = 0; i < coins.length; i++) {
            coins[i] = scn.nextInt();
        }
        
        System.out.println(coinChange(A, 0, coins, new Integer[A + 1][coins.length]));
        scn.close();
    }

    public static int coinChange(int A, int idx, int[] coins, Integer[][] dp) {
        if (A == 0) {
            return 1;
            
        }
        
        
        
        if (A < 0 || idx == coins.length) {
            return 0;
        }
        
        if (dp[A][idx] != null) {
            return dp[A][idx];
        }
        
        int includeCurrent = coinChange(A - coins[idx], idx, coins, dp);
        int excludeCurrent = coinChange(A, idx + 1, coins, dp);
        
        dp[A][idx] = includeCurrent + excludeCurrent;
        
        return dp[A][idx];
    }
}
