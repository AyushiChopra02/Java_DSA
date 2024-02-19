package lec24;

public class fibo {
public static void main(String[] args) {
	System.out.println(Fibo(4));
}
public static int Fibo(int n) {
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
	int sp1 = Fibo(n-1);
int sp2 = Fibo(n-2);
//fibo m n-1 and n-2 no. ka sum bnta h agla no.
return sp1 + sp2;
}
}
