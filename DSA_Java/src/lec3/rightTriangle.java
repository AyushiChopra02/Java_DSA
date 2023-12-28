package lec3;

public class rightTriangle {
public static void main(String[] args) {
	int n = 15;
	int r = 1;
	int tots_str = 1;
	while(r <=n) {
		int cnt_st =0;
		while(cnt_st<tots_str) {
			System.out.print("*");
			cnt_st++;
			
		}
		System.out.println();
		r++;
		tots_str++;
	}
}
}
