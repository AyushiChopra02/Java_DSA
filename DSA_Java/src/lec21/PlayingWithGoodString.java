package lec21;

import java.util.Scanner;

public class PlayingWithGoodString {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String S = scanner.nextLine();
	        System.out.println(findLongestGoodString(S));
	    }

	    public static int findLongestGoodString(String S) {
	        int max_length = 0;
	        int current_length = 0;
	//hr chr k lie  S string k andr chlga
	        for (char ch : S.toCharArray()) {
	            if (isVowel(ch)) {
	                current_length++;
	            } else {
	                //maxlen aur currnt_len m jo bda h usay max_len m dalege
	                max_length = Math.max(max_length, current_length);
	                current_length = 0;
	            }
	        }

	        // Update max_length one more time to handle cases where the longest good string extends to the end of the input string
	        max_length = Math.max(max_length, current_length);

	        return max_length;
	    }

	    public static boolean isVowel(char ch) {
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}

	    


}
