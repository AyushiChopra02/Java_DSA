package lec22;

public class Recursion {
public static void main(String[] args) {
	PI(5); ///PI - print increasing
	
}

private static void PI(int n) {
	if(n==0) { //smallest problem  // base condition
		return ; 
	}
	//BP : PI(n)
	//SP : PI(n-1)
	System.out.println(n);
	PI(n-1);
}
	
public static void PDI(int n) {
	if(n==0) {
		return ;
	}
	//BP(bigger prblm) = PDI(n);
	//SP(smller prblm) = PDI(n-1);
	System.out.println(n);
	PDI(n-1);
	System.out.println(n);
}
}
