package lec6;

public class F_to_C {
public static void main(String[] args) {
	int minF = 0;
	int maxF = 100;
	int step = 20;
	//3 input lia h
	int F = minF;
	while(F <= maxF) {
		
		//frmla to convrt f to c
		// 5.0 isliye likha h kuki 5/9 = 0.5 or int m h to 0 e ayega age ka nai ata
		// isliye 5.0 likha and int likha h kuki int C h aur 5.0 double hojega jisse mismatch 
		//hojega isliye aage int likhdia brckt lgaya ki pahle sb cacln hogi fr baad m int m 
		//chnge
		
		int C = (int)((5.0 / 9) * (F-32));
		System.out.println(F + "\t" + C);
		F = F + step;
	}
}
}
