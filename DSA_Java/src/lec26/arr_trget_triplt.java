package lec26;

import java.util.Arrays;
import java.util.Scanner;

public class arr_trget_triplt {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// size of an array
			int i = sc.nextInt();
			int arr[] = new int[i];
			// array input
			for (int idx = 0; idx < arr.length; idx++) {
				arr[idx] = sc.nextInt();}
			int target = sc.nextInt();
			findPairSum(arr, target);}
		static void findPairSum(int[] arr, int target) {
			int left,right;
			Arrays.sort(arr);
			for (int i = 0; i < arr.length - 2; i++) {
					left=i+1;
					right=arr.length-1 ;	
					while(left<right) {
						
						if(arr[i]+arr[left]+arr[right]==target) {
							System.out.println(arr[i]+","+" "+arr[left]+" "+"and"+" "+arr[right]);
						}
						if(arr[i]+arr[left]+arr[right]>target)  {
							right--;
						}else {left++; }
					}
			}

		}

	}

