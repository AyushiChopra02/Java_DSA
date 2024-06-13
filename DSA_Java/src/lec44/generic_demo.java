package lec44;

public class generic_demo {
public static void main(String[] args) {
	student[] arr = new student[5];
	arr[0] = new student(10, "A");
	arr[1] = new student(2, "B");
	arr[2] = new student(20, "Al");
	arr[3] = new student(11, "d");
	arr[4] = new student(1, "ds");
}
//public static void print(Object[]arr) {
	//for(Object obj : arr) {
		//System.out.println(obj);
	//}
//}
public static <tui> void print(tui[] arr) {
	for(tui ali : arr) {
		System.out.println(ali);
	}
}
}
