package lec33;

import java.util.Scanner;

public class countWayToNthStair {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int ways = countWays(N);

	        System.out.println(ways);
	    }
	    public static int countWays(int n) {        
	        if (n == 0 || n == 1) {
	            return 1; 
	        } else if (n == 2) {
	            return 2; 
	        }      
	        return countWays(n - 1) + countWays(n - 2);
	    }
	}


