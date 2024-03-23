package lec35;
import java.util.Stack;
public class Stack_Ques {
public static void main(String[] args) {
	//jse arr list ko likhte h vse likha h stack ko
	Stack<Integer> S = new Stack<>();
	S.add(10);
	S.add(20);
	S.add(30);
	S.add(40);
	System.out.println(S);
	//pop se stack ka top elemnt nikl jayega jo ki 40 h
	System.out.println(S.pop());
	System.out.println(S);
	//peek srf top ka elmnt btata h remove nai krta 
	//40 ko pop krne k baad 30 rhgya top pr
	System.out.println(S.peek());
	System.out.println(S.isEmpty());
}
}
