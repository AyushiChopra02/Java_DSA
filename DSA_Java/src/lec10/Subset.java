package lec10;

public class Subset {
public static void main(String[] args) {
	int arr[] = {10,20,30,40,50};
	for(int s =0 ; s < arr.length ; s++) {
		for(int e = s ;  e<arr.length ; e++) {
			for(int i=s; i<=e ; i++ ) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(); 
		}
	}
}
}
