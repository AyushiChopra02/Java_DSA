package lec8;

public class rotate {
public static void main(String[] args) {
	int arr[] = {10,20,30,40, 50};
	print(arr);
	Rotate(arr , 1);
	print(arr);
}
public static void print(int arr[]) {
	//ali in arr
	for(int ali : arr) {
		System.out.print(ali + " ");
		
	}
	System.out.println();
	
}
public static void Rotate(int arr[], int rot) {
	rot = rot % arr.length;
	for(int r =1 ; r <=rot ; r++) {
		int jeeb = arr[arr.length - 1];
		//ulta loop
		for(int i = arr.length - 1 ; i>= 1 ; i--) {
			arr[i] = arr[i-1];
		}
		//ise jo 0 pr 10 h vo 50 hojega
		arr[0] = jeeb;
	}
}
}
