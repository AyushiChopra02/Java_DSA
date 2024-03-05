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
	        return stringToIntegerHelper(str, str.length() - 1, 0);
	    }

	    private static int stringToIntegerHelper(String str, int index, int result) {
	        // Base case: if we have processed all characters
	        if (index < 0) {
	            return result;
	        }

	        // Convert the current character to integer
	        int digit = str.charAt(index) - '0';

	        // Update the result with the current digit
	        result = result * 10 + digit;

	        // Recur for the remaining substring (excluding the current character)
	        return stringToIntegerHelper(str, index - 1, result);
	    }
	}

	    


