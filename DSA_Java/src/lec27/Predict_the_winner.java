package lec27;

public class Predict_the_winner {
	class Solution {
	    public boolean predictTheWinner(int[] nums) {  
	//n variable mein nums array ka length store kiya gaya hai.
	    int n = nums.length;
	    int[][] dp = new int[n][n]; 
	// Ek 2D array dp banaya gaya hai n x n size ka, jisme hum score store karenge.
	    for (int i = 0; i < n; i++) {
	        dp[i][i] = nums[i]; // Single element case, player 1 m jayega
	    }
	    for (int len = 2; len <= n; len++) {
	        for (int i = 0; i <= n - len; i++) {
	            int j = i + len - 1;
	//Jab Player 1 nums[i] choose karta hai, to remaining array ka score dp[i + 1][j] se subtract hota hai.
	//Jab Player 1 nums[j] choose karta hai, to remaining array ka score dp[i][j - 1] se subtract hota hai.
	            dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]) ;
	        }}    
	    return dp[0][n - 1] >= 0;
	    // 0 se (n-1) tak ke elements ka score calculate kiya, agar >= 0 hai to Player 1 jeetega
	}

	    }

}
