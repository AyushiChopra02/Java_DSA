package lec11;

public class prdctArrExcptSlf {
public static void main(String[] args) {
	int arr[] = { 3,1,2,4};
	for(int i = 0 ; i < arr.length ; i++) {
		long left =1 ;
		long right = 1;
		for(int j=0 ; j<i ; j++){
			left = left*arr[j];
		}
		for(int j = i+1; j <arr.length ; j++ ) {
			right = right*arr[j];
			
		}
		long ans = left*right ;
		System.out.print(ans+ " ") ;
	}
}
}
