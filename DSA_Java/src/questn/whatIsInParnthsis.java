package questn;

import java.util.Scanner;

public class whatIsInParnthsis {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);   
	        String str = scanner.nextLine();
	        scanner.close();
	        String result = getContentBetweenParentheses(str);
	        System.out.println(  result);
	    }
	    public static String getContentBetweenParentheses(String str) {
	        int startIndex = str.indexOf('(');
	        if (startIndex == -1) {
	            return "";
	        }
	        int endIndex = findClosingParenthesis(str, startIndex + 1);
	        if (endIndex != -1) {
	            return str.substring(startIndex + 1, endIndex) ;
	        } else {
	            return "";
	        }}
	    private static int findClosingParenthesis(String str, int index)  {
	        if (index >= str.length()) {
	            return -1;}
	        if (str.charAt(index) == ')') {
	            return index;
	        }
	        return findClosingParenthesis(str, index + 1)  ;
	    }
	}


