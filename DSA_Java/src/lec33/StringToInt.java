package lec33;

import java.util.Scanner;

public class StringToInt {
	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        //System.out.print("Enter a number in form of a String: ");
	        String str = scanner.nextLine();
	        scanner.close();

	        int result = stringToInteger(str);
	        System.out.println(result);
	    }
	    public static int stringToInteger(String str) {
	        return stringToIntegerHelper(str, 0, 0);
	    }
	    private static int stringToIntegerHelper(String str, int index, int result) {
	        if (index >= str.length()) {
	            return result;
	        }
	        int digit = str.charAt(index) - '0';
	        result = result * 10 + digit;
	        return stringToIntegerHelper(str, index + 1, result);
	    }
}
