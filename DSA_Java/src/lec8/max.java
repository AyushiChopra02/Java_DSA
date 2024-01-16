package lec8;

public class max {
public static void main(String[] args) {
	int arr[] = {-100 , 2 , 1 };
	Max(arr);
}
//returnn type Max ka int hota h islie void ki jgah int likha
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
