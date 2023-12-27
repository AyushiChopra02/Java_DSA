package lec3;

public class GCD {
public static void main(String[] args) {
	int n1 =26 ;
	int n2 = 74;
	int divisor = n1 ;
	int dividend = n2;
	int rem = 0;
	while(rem> 0) {
		rem = dividend% divisor;
		dividend = divisor;
		divisor = rem;
		
	}
	System.out.println(dividend);
}
}
