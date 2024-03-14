package questn;

import java.util.Scanner;

public class MazePath_D2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        int count = findPaths(n, 0, 0, "");
	        System.out.println(count);
	    }

	    public static int findPaths(int n, int row, int col, String path) {
	    	//condtion to chck ki agr hm btm right crnr pr phonche k nai
	        if (row == n - 1 && col == n - 1) {
	            System.out.print(path + " ");
	            return 1;
	        }

	        int count = 0;
	      //findPaths function ko niche ki taraf jane ke liye.
	        if (row < n - 1) {
	            count += findPaths(n, row + 1, col, path + "V"); // Move down
	        }
	        // agar hum right edge tak nahi pahunch gaye hain to.
	        if (col < n - 1) {
	            count += findPaths(n, row, col + 1, path + "H"); // Move right
	        }
	     // agar hum diagonal move kar sakte hain to.
	        if ((row == col || row + col == n - 1) && row < n - 1 && col < n - 1) {
	        	//findPaths function ko diagonal ki taraf jane ke liye.
	            count += findPaths(n, row + 1, col + 1, path + "D"); // Move diagonally
	        }
	     // total paths ka count return karta hai.
	        return count;
	    }
	}
