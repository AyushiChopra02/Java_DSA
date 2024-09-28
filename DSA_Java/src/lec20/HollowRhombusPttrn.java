package lec20;

import java.util.Scanner;
public class HollowRhombusPttrn {
	public static void main(String[] args) {
		
		    
		Scanner sc = new Scanner(System.in);
				String str1 = sc.next();
				System.out.println(RemoveDuplet(str1));
			}

			public static String RemoveDuplet(String input) {
				if (input.length() <= 1 || input.length() > 1000) {
					return input;
				}	
				//BP: full string
				//SP: Small string
			  	
				if(input.charAt(0)==input.charAt(1)) {
					return RemoveDuplet(input.substring(1));
				
				}
				else {
					return input.charAt(0) + RemoveDuplet(input.substring(1));

				}	 	
		}
		}


