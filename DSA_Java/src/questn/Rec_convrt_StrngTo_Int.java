package questn;

import java.util.Scanner;

public class Rec_convrt_StrngTo_Int {
	
	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a no.: ");
	        String str = scanner.nextLine();
	        scanner.close();

	        int result = stringToInteger(str) ;
	        System.out.println("Conv int : " + result);
	    }
	    public static int stringToInteger(String str) {
	        return stringToIntegerHelper(str, str.length() - 1, 0) ;
	    }
	    private static int stringToIntegerHelper(String str, int index, int result) {
	        
	        if (index < 0) {
	            return result;
	        }
	        int digit = str.charAt(index) - '0';
	        result = result * 10 + digit;
	        return stringToIntegerHelper(str, index - 1, result);
	    }
	}

	    


