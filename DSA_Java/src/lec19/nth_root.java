package lec19;

import java.util.Scanner;
public class nth_root {
	public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);
	        int i = sc.nextInt();
	    
	        for (int idx = 0; idx < i; idx++) {
	        	int n = sc.nextInt();
	        	int m = sc.nextInt();
	        	System.out.println(NthRoot(n,m));
			}
		}
    public static int NthRoot(int n, int m) {
		        int low = 1, high = m;
		        while(low <= high){
		            int mid = (low+high)/2;
		            if(Math.pow(mid, n) == m){
		                return mid;
		            }else if(Math.pow(mid, n) < m){
		                low = mid+1;
		            }else{
		                high = mid-1 ;
		            }
		        }
		        return -1;
		    }
}


