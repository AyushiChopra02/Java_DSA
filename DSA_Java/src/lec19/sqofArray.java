package lec19;

import java.util.Arrays;
import java.util.Scanner;


	public static  void(String[] args) {
		Scanner sc = new Scanner(System.in);

		// No of test cases
		int t = sc.nextInt();
		int i = 0;
		while (i < t) {
			// No. of available roses
			int avl_rose = sc.nextInt();

			// Price of roses
			int arr[] = new int[avl_rose];
			for (int idx = 0; idx < arr.length; idx++) {
				arr[idx] = sc.nextInt();
			}

			// Money Deepak has.
			int m = sc.nextInt();

			A_Sort(arr);
			myfunction(arr, m);
			System.out.println();
			i++;
		}

	}

	public static void myfunction(int[] arr, int m) {
		int no1 = 0;
		int no2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == m) {
					int max = Integer.MAX_VALUE;
					if (arr[i] + arr[j] < max) {
						max = arr[j] - arr[i];
						no1 = arr[i];
						no2 = arr[j];
					}
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + no1 + " and " + no2 + ".");

	}

	public static void A_Sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
C