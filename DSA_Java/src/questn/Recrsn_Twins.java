package questn;

import java.util.Scanner;
public class Recrsn_Twins {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.nextLine();
	        System.out.println(countTwins(str));
	    }
	    public static int countTwins(String str) {
	        //If the string length is less than 3, it can't have twins
	        if (str.length() < 3) {
	            return 0;
	        }
	        // Check for twins starting from the 2nd character
	        int twins = countTwins(str.substring(1));
	        // If the current character and the character before it are the same
	        // and the character after them is also the same, then we have a twin
	        if (str.charAt(0) == str.charAt(2)) {
	            twins++;
	        }
	        return twins;
	    }
	}


