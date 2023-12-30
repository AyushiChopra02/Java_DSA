package lec4;

public class patrn_21 {
public static void main(String[] args) {
	int n=5;
	int r = 1;
	int tot_sp=7;
	int tot_st = 1 ;
	while(r <= n ) {
		int cnt_st1=0;
		while(cnt_st1 < tot_st) {
			System.out.print("* ");
			cnt_st1++;
		}	
		int cnt_sp=0;
		while(cnt_sp < tot_sp) {
			System.out.print("  ");
			cnt_sp++;
	}
		int cnt_st2=0;
	
		if(r==n) {
			cnt_st2=1;
		}
		while(cnt_st2 < tot_st) {
			System.out.print("* ");
			cnt_st2++;
		}
		System.out.println();
		tot_st++;
		tot_sp=tot_sp-2;
		r++;
	}
}
}
	


