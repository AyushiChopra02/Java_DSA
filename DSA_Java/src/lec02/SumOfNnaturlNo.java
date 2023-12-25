package lec02;

public class SumOfNnaturlNo {
	public static void main(String[] args) {
		int sum = 0 ;
		int count = 1;
		int n = 5;
		while(count<=n) {
			System.out.println(count);
			
			sum+=count;
			count++;
		}
		System.out.println(sum);
	}

}
 