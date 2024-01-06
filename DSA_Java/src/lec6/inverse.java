package lec6;

import java.util.Scanner;

public class inverse {
	
	    public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int temp = n;
	        int nod = 0;
	        int ans = 0;
	        while(temp > 0){
	            nod ++ ;
	            temp /= 10;

	        }
	        for(int i = 1 ; i <= nod ; i++){
	            int posInAns = n%10;
	            ans += i * (int) Math.pow(10 , posInAns - 1);
	            n = n /10;  
	        }
	        System.out.println(ans);

	    }
	}

