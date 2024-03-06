package lec33;

import java.util.Scanner;

public class All_subsq {
	    public static void printSubsequences(String str, int index, String output) {
	        if (index == str.length()) {
	            if (!output.equals(""))
	                System.out.println(output);
	            return;
	        }   
	        // Exclude current character
	        printSubsequences(str, index + 1, output);
	        
	        // Include current character
	        printSubsequences(str, index + 1, output + str.charAt(index));
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        for (int i = 0; i < N; i++) {
	            String str = scanner.nextLine();
	            System.out.println("Subsequences of " + str + ":");
	            printSubsequences(str, 0, "");
	        }
	    }
	}
