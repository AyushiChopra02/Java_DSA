package lec23;

public class print_revrsearray {
public static void main(String[] args) {
	int arr[] = {10 ,20,30,40};
	PrintRev(0 , arr);
}
	public static void PrintRev(int s  , int arr[]) {

		//BP : printRev(s , arr)
		//SP : printRev(s+1 , arr)
		if(s == arr.length) {
			return ;
		}
		PrintRev(s+1 , arr);
		System.out.println(arr[s]);
}
}

