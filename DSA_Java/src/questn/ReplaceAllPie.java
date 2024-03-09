package questn;

import java.util.Scanner;

public class ReplaceAllPie {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of lines: ");
	        int N = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < N; i++) {
	            String str = scanner.nextLine();
	            String result = replacePi(str);
	            System.out.println(result);
	        }
	        scanner.close();
	    }
	    public static String replacePi(String str) {
	        if (str.length() < 2) {
	            return str;
	        }
	        if (str.substring(0, 2).equals("pi")) {
	            return "3.14" + replacePi(str.substring(2));
	        } else {
	            return str.charAt(0) + replacePi(str.substring(1));
	        }
	    }
	}


