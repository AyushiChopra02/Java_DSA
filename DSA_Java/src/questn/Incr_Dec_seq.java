package questn;

import java.util.Scanner;

public class Incr_Dec_seq {
	
		public static void main(String[] args) {
			Scanner snc = new Scanner(System.in);
			int n = snc.nextInt();
			int prev = Integer.MAX_VALUE;
			int dec_state = 1;
			int ans = 1;
			while (n > 0) {
				int curr = snc.nextInt();
				if (dec_state ==1 && prev < curr) {
					dec_state = 0;
				}
				if(dec_state==0 &&  prev>curr) {
					ans = 0;
				}
				if(curr==prev)  {
					ans = 0;
				}
				prev = curr;
				n--;
			}
			if(ans==0){
				System.out.println("false");
			}else{
				System.out.println("true");
			}
		}
	
	
}
