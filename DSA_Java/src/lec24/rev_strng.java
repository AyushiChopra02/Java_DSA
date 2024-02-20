package lec24;

import java.util.Scanner;

public class rev_strng {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        scanner.close();

	        String reversedString = reverseWords(input);
	        System.out.println(reversedString);
	    }

	    public static String reverseWords(String s) {
	        String[] words = s.split("\\s+");

	        StringBuilder reversed = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]);
	            if (i > 0) {
	                reversed.append(" "); // Append space only if it's not the last word
	            }
	        }

	        return reversed.toString();
	    }
	}


