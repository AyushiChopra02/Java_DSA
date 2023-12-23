package lec1;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int num1 = scn.nextInt();
			int num2 = scn.nextInt();
			
			int num3 = scn.nextInt();
			System.out.println(num1 + num2 + num3);
		}
		
	}

}
