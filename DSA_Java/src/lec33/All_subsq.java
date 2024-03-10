package lec33;

import java.util.Scanner;

public class All_subsq {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        String str = scanner.nextLine();

	        System.out.println( str );
	        findAllSubsequences(str, "");
	        
	        scanner.close();
	    }

	    // Recursive function to find all subsequences of a string
	    public static void findAllSubsequences(String input, String output) {
	        // Base case: If we have processed all characters of the input
	        if (input.length() == 0) {
	            if (!output.equals("")) {
	                System.out.println(output);
	            }
	            return;
	        }

	        // Recursive call including the current character
	        findAllSubsequences(input.substring(1), output + input.charAt(0));

	        // Recursive call excluding the current character
	        findAllSubsequences(input.substring(1), output);
	    }
	}
