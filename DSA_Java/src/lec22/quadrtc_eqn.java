package lec22;

import java.util.Scanner;

public class quadrtc_eqn {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        
	        double discriminant = b * b - 4 * a * c;
	        
	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("Real and Distinct");
	            System.out.println((int)Math.min(root1, root2) + " " + (int)Math.max(root1, root2));
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            System.out.println("Real and Equal");
	            System.out.println((int)root + " " + (int)root);
	        } else {
	            System.out.println("Imaginary");
	        }
	        
	        scanner.close();
	    }
	}


