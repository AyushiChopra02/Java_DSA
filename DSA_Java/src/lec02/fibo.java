package lec02;

public class fibo {
	public static void main(String[] args) {
		int n =5 ;
		int cnt = 1  ;
		int a = 0  ;
		int b =1;
		int c = 0 ;
		while(cnt <= n) {
			c = a+b ;
			a=b ;
			b=c ;
			cnt++;
		}
		System.out.println(c);
	}

}
