package lec4;

public class patrn_15 {
	public static void main(String[] args) {
		
	
int n=5;
int r = 1;
int tot_sp=0;
int tot_str = 	n;
while(r <= 2 * n - 1) {
	int cnt_sp=0;
	while(cnt_sp < tot_sp) {
		System.out.print("  ");
		cnt_sp++;
	}	
	int cnt_str=0;
	while(cnt_str < tot_str) {
		System.out.print("* ");
		cnt_str++;
}
	System.out.println();
	if(r<n) {
		tot_sp = tot_sp + 2;
		tot_str--;
	}
	else {
		tot_sp = tot_sp - 2;
		tot_str++;
	}
	r++;

}
}
}
