package lec6;

import java.util.Scanner;

public class ShoppingGame {
	
	
	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);

	        System.out.print(" max smartphones Aayush can purchase (M): ");
	        int m = scn.nextInt();

	        System.out.print("max smartphones Harshit can purchase (N): ");
	        int n = scn.nextInt();

	        int aayushRemaining = m;
	        int harshitRemaining =  n;

	        
	        while (true) {
	            
	            for (int i = 1; i <= aayushRemaining; i++) {
	                aayushRemaining -= i;
	                if (aayushRemaining <= 0) {
	                    System.out.println("Harshit");
	                    return;
	                }
	            }

	           
	            for (int i = 1; i <= harshitRemaining; i++) {
	                harshitRemaining -= i;
	                if (harshitRemaining <= 0) {
	                    System.out.println("Aayush");
	                    return;
	                }
	            }
	        }
	    }
}	


