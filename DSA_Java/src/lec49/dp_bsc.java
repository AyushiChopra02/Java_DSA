package lec49;

public class dp_bsc {
	public static void main(String[] args) {
		int n = 1000;
		System.out.println(FiboTD(n,new Integer[n+1]);
	}
	//top down apprch , memoziation
	
	public static int FiboTD(int n, Integer[] arr) {
		if (n <= 1) {
			return n;
		}
		if(arr[n] != null) {
			return arr[n];
		}
	int sp1 = FiboTD(n-1 ,arr);
	int sp2 = FiboTD(n-2 ,arr);
	return arr[n] = sp1 + sp2;
	
	}
	//Bottom Up    Tabulation
	public static int FiboBU(int N) {
		//Step 5 : dp array ka size!!
		int[] dp = new int[N+100];
		// Step 4 : Base case
		dp[1] = 1;
		// Step 1 : smallest to biggest
		for(int n=2 ; n <= N ; n++) {
			// code copy pasta
			// from TD  and use DP array
			int sp1 = dp[n-1];
			int sp2 = dp[n-2];
			dp[n] = sp1 + sp2;
		}
		// Step 3 : return biggest problem
		
		return dp[N];
	}

}
