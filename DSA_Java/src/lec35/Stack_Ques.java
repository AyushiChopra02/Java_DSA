package lec35;
import java.util.Stack;
public class Stack_Ques {
public static void main(String[] args) {
	//jse arr list ko likhte h vse likha h stack ko
	Stack<Integer> S = new Stack<>();
	//push and add is same
	S.add(10);
	S.add(20);
	S.add(30);
	S.add(40);
	System.out.println(S);
	//pop se stack ka top elemnt nikl jayega jo ki 40 h
	//System.out.println(S.pop());
	System.out.println(S);
	//peek srf top ka elmnt btata h remove nai krta 
	//40 ko pop krne k baad 30 rhgya top pr
	System.out.println(S.peek());
	System.out.println(S.isEmpty());
	//print(S);
	//rev_print(S);
	printRev_R(S);
	System.out.println(S);
	//System.out.println(S);
}
public static void printRev_R(Stack<Integer> S) {
	if(S.isEmpty()) {
		return;
	}
	int ali = S.pop();
	printRev_R(S);
	System.out.println(ali);
	S.add(ali);
}
public static void print(Stack<Integer> S) {
	Stack<Integer> Ex = new Stack<>();
	while(!S.isEmpty()) {
		int ali = S.pop();
				System.out.println(ali +" ");
				Ex.add(ali);
	}
	System.out.println();
	while(!Ex.isEmpty()) {
		int ali = Ex.pop();
				//System.out.println(ali +" ");
				S.add(ali);
}
	}
public static void rev_print(Stack<Integer> S) {
	Stack<Integer> Ex = new Stack<>();
	while(!S.isEmpty()) {
		int ali = S.pop();
				//System.out.println(ali +" ");
				Ex.add(ali);
	}
	System.out.println();
	while(!Ex.isEmpty()) {
		int ali = Ex.pop();
				System.out.println(ali +" ");
				S.add(ali);
}
	System.out.println();
}
}
