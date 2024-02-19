package lec24;

public class power {
public static void main(String[] args) {
	System.out.println(Pow(2,3));
}
public static int Pow(int a , int b) {
	if(b==0) {
		return 1;
	}
	int sp = Pow(a , b-1);
	return sp * a;
}
}
