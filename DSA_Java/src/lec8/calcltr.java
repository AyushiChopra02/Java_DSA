package lec8;

import java.util.Scanner;

public class calcltr{
	public static void main(String[] args) {
		
	
	        Scanner scn = new Scanner(System.in);
	        char operator = scn.next().charAt(0);
	        while(operator != 'X' && operator != 'x'){
	            if(operator == '+'){
	                int no1 = scn.nextInt();
	                int no2 = scn.nextInt();
	                System.out.println(no1 + no2);
	                operator = scn.next().charAt(0);
	            }else if(operator == '-' ){
	int no1 = scn.nextInt();
	                int no2 = scn.nextInt();
	                System.out.println(no1 - no2);
	                operator = scn.next().charAt(0);
	            }else if(operator == '*'){
	                int no1 = scn.nextInt();
	                int no2 = scn.nextInt();
	                System.out.println(no1 * no2);
	                operator = scn.next().charAt(0);
	            }else if(operator == '/'){
	                int no1 = scn.nextInt();
	                int no2 = scn.nextInt();
	                System.out.println(no1 / no2);
	                operator = scn.next().charAt(0);
	            }else if(operator == '%'){
	                int no1 = scn.nextInt();
	                int no2 = scn.nextInt();
	                System.out.println(no1 % no2);
	                operator = scn.next().charAt(0);
	            }else{
	                System.out.println("Invalid Operation. Try again. ");
	                System.out.println();
	                operator = scn.next().charAt(0);
	        }
	    }
	    System.out.println();
	}

}
