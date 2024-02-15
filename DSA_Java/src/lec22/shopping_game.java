package lec22;

import java.util.Scanner;
public class shopping_game {
	    public static void main(String args[]) {
	 Scanner scn = new Scanner(System.in);        
		        int m = scn.nextInt();        
		        int n = scn.nextInt();
		        int aayushRemaining = m;
		        int harshitRemaining = n;        
		        while (true) {            
		            for (int i = 1; i <= aayushRemaining; i++) {
		                aayushRemaining -= i;
		                if (aayushRemaining <= 0) {
		                    System.out.println("Harshit") ;
		                    return;
		                }}          
		            for (int i = 1; i <= harshitRemaining; i++) {
		                harshitRemaining -= i;
		                if (harshitRemaining <= 0) {
		                    System.out.println("Aayush");
		                    return ; 
		                }
		            }
		        }
		    }
	}




