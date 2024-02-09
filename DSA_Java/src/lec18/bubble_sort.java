package lec18;

public class bubble_sort {

	
public static void main(String[] args) {
	int arr[]= {5,7,10,10,10,20,30,30,50,60,60,60,80};
	bubble(arr);
}
		public static void bubble(int arr[]) {
	for(int cnt =1  ; cnt < arr.length ; cnt++) {
		for(int s = 0 ; s<= arr.length -2 ; s++ ) {
			if(arr[s] > arr[s+1]) {
				int temp = arr[s];
				arr[s] = arr[s+1];
				arr[s+1] = temp ;
				
			}
		}
}
}
}
