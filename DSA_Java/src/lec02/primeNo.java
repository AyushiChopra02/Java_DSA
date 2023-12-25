package lec02;

public class primeNo {
	public static void main(String[] args) {
		
	
	int n =8 ;
	int divisor = 1;
	int num_fact = 0 ;
	while(divisor<=n) {
		int remnder = n % divisor;
		if(remnder == 0) {
			num_fact++;
		}
		System.out.println(divisor + "-" + remnder);
		divisor++;
	}
if(num_fact==2) {
	System.out.println("prime");
	
}
else {
	System.out.println("not prime");
}
}
}
