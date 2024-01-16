package lec8;

public class max {
public static void main(String[] args) {
	int arr[] = {-100 , 2 , 1 };
	print(arr);
	Max(arr);
	print(arr);
}
//returnn type Max ka int hota h islie void ki jgah int likha
public static void print(int arr[]) {
	for(int ali : arr) {
		System.out.print(ali + " ");
	}
	System.out.println();
}
public static int Max(int arr[]) {
	int jeb = arr[0];
	//aam in arr
	for(int aam : arr) {
		if(aam > jeb) {
			jeb = aam;
		}
	}
	return jeb;
}

}
