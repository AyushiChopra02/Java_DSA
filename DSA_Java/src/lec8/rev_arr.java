package lec8;

public class rev_arr {
public static void main(String[] args) {
	int arr[] = {10,20,30,40,50};
	//fncn call kia
	reverse(arr);
	Find(arr, 0);
}

//void retrn nai krta kuch

public static void reverse(int arr[]) {
	//ulta loop chlaya
	for(int indx =4 ; indx >= 0 ; indx--) {
		System.out.print(arr[indx]+ " ");
	}
	System.out.println();
}							


//Find

public static int Find(int arr[] , int ali) {
	for(int idx=0 ; idx<arr.length ; idx++) {
		if(arr[idx] == ali) {
			return idx;
		}
	}
		return -1;
	}
}
