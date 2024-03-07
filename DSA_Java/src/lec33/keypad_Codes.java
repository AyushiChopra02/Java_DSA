package lec33;

import java.util.Scanner;

public class keypad_Codes {
	

	
	    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    
	    // Function to print all possible words for a given keypad string
	    public static void printWords(String str, String output) {
	        if (str.length() == 0) {
	            System.out.print(output + " ");
	            return;
	        }
	        
	        int digit = Character.getNumericValue(str.charAt(0));
	        if (digit < 2 || digit > 9) {
	            System.out.println("Invalid input");
	            return;
	        }
	        
	        String letters = keypad[digit];
	        for (int i = 0; i < letters.length(); i++) {
	            printWords(str.substring(1), output + letters.charAt(i));
	        }
	    }
	    
	    // Function to return the count of words for a given keypad string
	    public static int countWords(String str, String output) {
	        if (str.length() == 0) {
	            if (!output.equals(""))
	                return 1;
	            return 0;
	        }
	        
	        int count = 0;
	        int digit = Character.getNumericValue(str.charAt(0));
	        if (digit < 2 || digit > 9) {
	            return -1; // Return -1 for invalid input
	        }
	        
	        String letters = keypad[digit];
	        for (int i = 0; i < letters.length(); i++) {
	            count += countWords(str.substring(1), output + letters.charAt(i));
	        }
	        
	        return count;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.nextLine();
	        
	        if (str.isEmpty()) {
	            System.out.println("Empty input");
	            return;
	        }
	        
	        System.out.println("Words formed by keypad sequence " + str + ":");
	        printWords(str, "");
	        
	        int count = countWords(str, "");
	        if (count == -1) {
	            System.out.println("Invalid input");
	        } else {
	            System.out.println("\nCount of words formed: " + count);
	        }
	    }
	}

	
		
	

	
	    