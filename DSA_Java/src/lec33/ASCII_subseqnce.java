package lec33;

import java.util.Scanner;

public class ASCII_subseqnce {
	
	    // Function to return the count of ASCII-subsequences
	    public static int countASCII(String str, int index, String output) {
	        if (index == str.length()) {
	            if (output.length() > 0)
	                return 1;
	            else
	                return 0;
	        }
	        
	        int count = 0;
	        count += countASCII(str, index + 1, output); // Exclude current character
	        
	        // Include current character
	        count += countASCII(str, index + 1, output + str.charAt(index));
	        count += countASCII(str, index + 1, output + (int)str.charAt(index));
	        
	        return count;
	    }
	    
	    // Function to print all possible ASCII-subsequences
	    public static void printASCII(String str, int index, String output) {
	        if (index == str.length()) {
	            if (output.length() > 0)
	                System.out.print(output + " ");
	            return;
	        }
	        
	        printASCII(str, index + 1, output); // Exclude current character
	        
	        // Include current character
	        printASCII(str, index + 1, output + str.charAt(index));
	        printASCII(str, index + 1, output + (int)str.charAt(index));
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.nextLine();
	        
	        System.out.println("The ASCII-subsequences are:");
	        printASCII(str, 0, "");
	        
	        System.out.println("\nThe count of ASCII-subsequences is: " + countASCII(str, 0, ""));
	    }
	}
