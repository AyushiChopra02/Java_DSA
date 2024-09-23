package lec16;

import java.util.ArrayList;

public class arrL_ques {
public static void main(String[] args) {
	int arr1[]= {5,7,10,10,10,20,30,30,50,60,60,60,80};
	int arr2[]= {10,10,15,20,30,30,30,60,70,80,80,90};
	System.out.println(Intersection(arr1 , arr2));
}
public static ArrayList<Integer> Intersection(int[]arr1 , int[]arr2){
	int idx1 =0 ;
	int idx2=0;
	ArrayList<Integer> AL = new ArrayList<>();
	while(idx1 < arr1.length && idx2 < arr2.length) {
		if(arr1[idx1] == arr2[idx2]) {
			AL.add(arr1[idx1]);
			idx1++;
			idx2++;
		}else if(arr1[idx1] < arr2[idx2]){
			idx1++;
		}else {
			idx2++;
		}
	}
	return AL; 
		
	
	
}
}
