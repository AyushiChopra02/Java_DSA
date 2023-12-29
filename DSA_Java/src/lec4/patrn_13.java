package lec4;

public class patrn_13 {
public static void main(String[] args)  {
	int n = 5;
	int r =1;
	int total_str=1;
	while(r <= 2 * n-1) {
		int cnt_str = 0;
		while(cnt_str < total_str) {
			System.out.print("* ") ;
			cnt_str++;
		}
		System.out.println();
		r++;
		if(r <= n) {
			total_str++;
		}else {
			total_str--;
		}
	}
}
}
