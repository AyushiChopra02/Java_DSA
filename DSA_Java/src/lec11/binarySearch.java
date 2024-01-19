package lec11;

public class binarySearch {
int arr[] = {10 , 20 , 30 , 40,5,60};
int elmnt = 70;
int strt = 0;
int end = arr.length - 1;
while(strt <= end) {
	int mid = (strt+ end)/2;
	if(arr[mid] > elmnt) {
		end = mid - 1;
		
	}
	else if(arr[mid]<elmnt){
		strt = mid + 1;
	}
	else {
		System.out.println("elemnt found at index" + mid);
	}
}
}
