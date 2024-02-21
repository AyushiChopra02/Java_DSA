package lec24;

import java.util.Scanner;
public class odd_even {
public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        scanner.close();
	        // odd numbers in dcrsng sqnce
	        printOdd(N);
	        //  even numbers in incrs sequence
	        printEven(2, N);
	    }
	    //  function to print odd numbers in decreasing sequence
	    public static void printOdd(int N) {
	        if (N <= 0) {
	            return;
	        }
	        if (N % 2 != 0) {
	            System.out.println(N);
	        }
	        printOdd(N - 1);
	    }

	    //  function to print even numbers in increasing sequence
	    public static void printEven(int start, int N)  {
	        if (start > N) {
	            return;
	        }
	        if (start % 2 == 0) {
	            System.out.println(start);
	        }
	        printEven(start + 1, N);
	    }
	

	    

}

