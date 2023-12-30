package lec4;

public class patrn_24 {
	public static void main(String[] args) {
	
	

	
		int n=5;
		int r=1;
		int total_sp = n-1;
		int total_str =1 ;
		int num = 1;
		while(r <= n) {
			//step2
			int cnt_sp=0;
			while(cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_str=0;
			while(cnt_str < total_str) {
				System.out.print(num+" ");
				cnt_str++;
			}
			r++;
			num++;
			total_sp --;
			total_str=total_str+2;
			System.out.println();
		}
	}
	}





