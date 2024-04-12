package lec24;

public class factorial {
public static void main(String[] args) {
	System.out.println(Fac(5)) ;
}
public static int Fac(int n) {
	if(n==0) {
		return 1 ;
	}
	//BP : Fac(n)
	//SP : FAC(n-1)
	int sp = Fac(n-1);
	return n * sp;
}
}
 
