package lec7;

public class Armstrng {
public static void main(String[] args) {
	printAllArm(1000);
}
public static void printAllArm(int n) {
	for(int num =1 ; num <=n ; num++) {
		if(isArm(num)) {
			System.out.println(num);
		}
	}
	
}
public static boolean isArm(int num) {
	int nod = numOfDigit(num);
	int sum = 0;
	int baackup = num ;
	while(num >0) {
		int dogit = num % 10;
		num = num/10;
		sum = sum + (int)Math.pow(dogit , nod);
		
	}
	if(baackup == sum) {
		return true;
	}
	else {
		return false;
	}
}
	public static int numOfDigit(int num) {
		int cnt = 0;
		while(num>0) {
			num = num/10;
			cnt ++;
		}
		return cnt;
	}
}

