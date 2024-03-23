package lec35;

import java.util.Stack;

public class next_grtr {
public static void main(String[] args) {
	int arr[]= {50 , 30,20,40,10,45,5,60,15,8};
	nextGrtr(arr);
}
public static void nextGrtr(int[] arr) {
	Stack<Integer> S = new Stack<>(); //potential A's
	for(int B : arr) {
		while(!S.isEmpty() && B >S.peek()) {
			int A = S.pop();
			System.out.println(A + "=>" + B);
		}
		S.add(B);

}
	while(!S.isEmpty() ) {
		int A = S.pop();
		System.out.println(A + "=>" + -1);
	}
	}}
