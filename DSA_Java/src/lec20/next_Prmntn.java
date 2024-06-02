package lec20;

public class next_Prmntn {
	public static void main(String[] args) {	
int num = 981354321;
char [] arr = (num + "").toCharArray();
int f= -1;
char prev = '0';
for(int idx = arr.length - 1 ; idx >=0 ; idx--) {
	char curr = arr[idx] ;
	if(curr < prev) {
		f = idx ;
		break;}
	prev = curr ;
}
//swap f with a digit just bigger than arr[f]
for(int idx = arr.length-1  ; idx > f ;idx--) {
	if(arr[idx] > arr[f]) {
		//idx with f swipe krna
		char temp = arr[idx];
		arr[idx] = arr[f];
		arr[f] = temp ;
		break ; } }
System.out.println(arr);
}
}
