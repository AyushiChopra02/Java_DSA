package questn;

import java.util.Scanner;

public class Rec_convrt_StrngTo_Int {
	
	    
	
	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number in form of a String: ");
	        String str = scanner.nextLine();
	        scanner.close();

	        int result = stringToInteger(str);
	        System.out.println("Converted Integer: " + result);
	    }

	    public static int stringToInteger(String str) {
	        return stringToIntegerHelper(str, 0); // Recursive helper function call
	    }

	    private static int stringToIntegerHelper(String str, int index) {
	        // Base case: if index goes beyond string length, return 0
	        if (index >= str.length()) {
	            return 0;
	        }

	       
	        int digit = str.charAt(index) - '0';

	        
	        int remaining = stringToIntegerHelper(str, index + 1);

	        
	        int placeValue = (int) Math.pow(10, str.length() - 1 - index);
	        return digit * placeValue + remaining;
	    }
	}
