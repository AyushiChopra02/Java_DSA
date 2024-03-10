package questn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binary_str {


		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();
	        scanner.nextLine(); 
	        for (int t = 0; t < T; t++) {
	            String str = scanner.nextLine();
	            List<String> results = generateBinaryStrings(str);
	            for (String result : results) {
	                System.out.print(result + " ");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	    public static List<String> generateBinaryStrings(String str) {
	        List<String> results = new ArrayList<>();
	        generateBinaryStringsHelper(str.toCharArray(), 0, results);
	        return results;
	    }

	    private static void generateBinaryStringsHelper(char[] arr, int index, List<String> results)  {
	        if (index == arr.length) {
	            results.add(new String(arr));
	            return;
	        }
	        if (arr[index] == '?') {
	            arr[index] = '0';
	            generateBinaryStringsHelper(arr, index + 1, results);
	            arr[index] = '1';
	            generateBinaryStringsHelper(arr, index + 1, results);
	            arr[index] = '?'; // Reset back to '?'
	        } else {
	            generateBinaryStringsHelper(arr, index + 1, results);
	        }
	    }
	}


