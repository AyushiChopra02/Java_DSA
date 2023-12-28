package lec4;

public class patrn_8 {
public static void main(String[] args) {
	int n=5;
	int r =1;
	int total_str=n;
	while(r<=n) {
		int cnt_str=0;
		while(cnt_str< total_str) {
			if(cnt_str + r == n || r == cnt_str+1) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			cnt_str++;
		}
		
		
		System.out.println();
		r++;
	}
}
}
