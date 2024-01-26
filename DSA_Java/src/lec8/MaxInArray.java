package lec8;

import java.util.Scanner;

public class MaxInArray {
	
	    public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in) ;
	        int n = scn.nextInt();
	        int arr[] = new int[n];
	        
 
	        
	        for (int idx = 0; idx < arr.length ;  idx++) {
	            arr[idx] = scn.nextInt() ;
	        }       
	        int max = maximum(arr , n) ;   
	System.out.println(max);
	        scn.close();
	    }

	    public static int maximum(int arr[], int n) {
	        if(n==0){
	            return 0;
	        }
	        int max = arr[0];
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
	}


