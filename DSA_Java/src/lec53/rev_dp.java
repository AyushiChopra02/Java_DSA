package lec53;

public class rev_dp {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("BU result: " + BU(n)); 
        // For top-down approach with memoization
        Integer[] dp = new Integer[n + 1];
        System.out.println("Top-down result: " + fib(n, dp));
    }
    
    // Top-down approach with memoization
    public static int fib(int n, Integer[] dp) {
        if (n <= 1) {
            return n;      
        }
        if (dp[n] != null) {
            return dp[n];
        }
        int sp1 = fib(n - 1, dp);
        int sp2 = fib(n - 2, dp);
        dp[n] = sp1 + sp2;
        return dp[n];
    }
    // Bottom-up approach
    public static int BU(int N) {
        if (N <= 1) {
            return N;
        }
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int n = 2; n <= N; n++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[N];
    }
}
