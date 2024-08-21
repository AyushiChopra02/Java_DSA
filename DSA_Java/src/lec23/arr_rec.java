package lec23;

public class arr_rec {
public static void main(String[] args) {
	int arr[] = {10 ,20,30,40};
	Print(0 , arr);
}
public static void Print(int s , int arr[])  {
	if(s == arr.length) {
		return ;
	}
	  
	 
	//BP : Print(0 , arr)
	//SP : Print(1,arr)
	System.out.println(arr[s]);
	Print(s+1 , arr);
	
} 
}
 