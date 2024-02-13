package lec21;

import java.util.Scanner;

public class anagram_palindrome {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        //puri line input lene k lie  and str m store hora h
	        String str = scanner.nextLine();
	        
	        //canformpalindrome ko call kre h
	        System.out.println(canFormPalindrome(str) ? "Yes" : "No");
	    }

	    public static boolean canFormPalindrome(String str) {
	        //array bnaya jisme char ki frq stre kre h
	        int[] freq = new int[256]; // Assuming ASCII characters

	        // Count the frequency of each character
	        for (char ch : str.toCharArray()) {
	            freq[ch]++;
	        }

	        // Count the number of characters with odd frequency
	        int oddCount = 0;
	        for (int count : freq) {
	            if (count % 2 != 0) {
	                oddCount++;
	            }
	        }

	        // If there's more than one character with odd frequency, it's not possible to form a palindrome
	        //agr  1 ya 1 se choti h to yea palindrome h
	        return oddCount <= 1;
	    }
	}


