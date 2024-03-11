package questn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Generate_parnths {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        List<String> result = generateParentheses(n);
	        for (String str : result) {
	            System.out.println(str);
	        }
	        scanner.close();
	    }
	    public static List<String> generateParentheses(int n) {
	        List<String> result = new ArrayList<>();
	        generateParenthesesHelper(n, n, "", result);
	        return result;
	    }
	    public static void generateParenthesesHelper(int open, int close, String current, List<String> result) {
	        if (open == 0 && close == 0) {
	            result.add(current);
	            return;
	        }

	        if (open > 0) {
	            generateParenthesesHelper(open - 1, close, current + "(", result);
	        }

	        if (close > open) {
	            generateParenthesesHelper(open, close - 1, current + ")", result);
	        }
	    }
	}
