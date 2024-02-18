package lec24;
public class frst_occ {
public static void main(String[] args) {
	int arr[] = { 6 ,5 , 6 , 5 ,5};
	int firstIndex = FirstOcc(0, arr, 5);
    System.out.println("First occurrence index: " + firstIndex);

    int lastIndex = LastOcc(0, arr, 5);
    System.out.println("Last occurrence index: " + lastIndex);}
public static int FirstOcc(int s , int arr[] , int ali) {
	if(s== arr.length) {
		return -1 ;
	}
		//BP : FO(s , ali , arr)
		//SP : FO(s+1 , arr,ali)
		int sp = FirstOcc(s+1 , arr , ali) ;
		if(arr[s] == ali) {
			return s;
		}
		return sp;
	}
	public static int LastOcc(int s , int arr[] , int ali) {
		if (s == arr.length) {
			return -1 ;
		}
		//BP : LO(s , arr , ali)
		//SP : LO(s+1 , arr , ali)
		int sp = LastOcc(s+1 , arr , ali);
			if(sp ==1  && arr[s] == ali) {
				return s ;
			}
			return sp ;
		}
	}


