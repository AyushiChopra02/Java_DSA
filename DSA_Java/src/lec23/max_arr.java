package lec23;

public class max_arr {
public static void main(String[] args) {
	int arr[] = { 5,2,10,6};
	Max(0,arr);
}
public static int Max(int s , int arr[]) {
	if(s == arr.length-1) {
		return arr[s];
	//if(s == arr.length) {
		// return Integer.MIN_VALUE;
		 //BP = Max(s , arr)
		 //SP = Max(s+1 , arr)
	}
		 int  sp = Max(s+1 , arr);
		 return Math.max(arr[s] , sp) ;
	

}
}
