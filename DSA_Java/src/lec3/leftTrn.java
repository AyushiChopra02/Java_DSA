package lec3;

public class leftTrn {
public static void main(String[] args) {
	int n = 5 ;
	int row = 1;
	int tots_st=1;
		int tots_sp =n-1 ;
			//step 1
		while (row	<= n) {
				//step 2 space prnt karo
			int cnt_sp=0;
			while(cnt_sp < tots_sp) {
				System.out.print(" ");
				cnt_sp++;
				
			}
			int cnt_st=0;
			while(cnt_str < tots_str) {
				System.out.print("*");
				cnt_st++;
				
			}
			row++;
			tots_sp--;
			tots_st++;
			System.out.println();
			
			
		}
}
}
