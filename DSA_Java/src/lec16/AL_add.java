package lec16;

import java.util.ArrayList;

public class AL_add {
public static void main(String[] args) {
	int arr1[]= {5,7,10,10,10,20,30,30,50,60,60,60,80};
	int arr2[]= {10,10,15,20,30,30,30,60,70,80,80,90};
	int idx1 = arr1.length -1;
	int idx2 = arr2.length - 1;
	int carry = 0;
	ArrayList<Integer> AL = new ArrayList<>();
	while(idx1 >= 0 || idx2 >= 0) {
		int sum = carry;
		if(idx1 <=0) {
			sum = sum + arr1[idx1];
		}
		if(idx2 <= 0) {
			sum = sum + arr2[idx2];
			
			}
			int digit = sum % 10;
			AL.add(digit);
			carry = sum /10 ;
			idx1 -- ;
			idx2 ++ ;
		}
	}
}
}
