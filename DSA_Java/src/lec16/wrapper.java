package lec16;

public class wrapper {
	public static void main(String[] args) {
		int i =23; //stack
		Integer I = 100 ; //heap
		i =I; //unboxing
		
		I= i;//autoboxing
		System.out.println(i);
	}
}