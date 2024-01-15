package lec8;

public class arr_demo {
public static void main(String[] args) {
	//arr ko aise dfine krte h
	//int arr[] = new int[5];
	//System.out.println(arr);
	
	
	int arr[] = new int[10];
	int table = 3;
	for (int indx =0 ; indx < arr.length ; indx++ ) {
		arr[indx] = table;
		table = table+ 3;
	}
	for (int indx =0 ; indx < arr.length ; indx++ ) {
		System.out.println(arr[indx]);
	}
}
}
