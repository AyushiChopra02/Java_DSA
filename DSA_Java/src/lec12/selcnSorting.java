package lec12;

import java.util.Arrays;

public class selcnSorting {
public static void main(String[] args) {
	int arr[] = {50,40,30, 20 ,10};
	System.out.println(Arrays.toString(arr));
	Selection(arr);
	System.out.println(Arrays.toString(arr));
}
public static void Selection(int arr[]) {
	for(int last = arr.length - 1; last >=1 ; last--) {
		int max_id =0;
		for(int i=0 ; i <=last ; i++) {
			if (arr[i] > arr[max_id]) {
				max_id = i;
				
			}
		}
		//swap
		int temp = arr[last];
		arr[last]= arr[max_id];
		arr[max_id] =temp;
	}
}
}
