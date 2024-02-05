package lec14;
//palindrome mtlb aage se read kre ya pichese same wrd bne
public class palindrome {
	public static void main(String[] args) {
		String str = "mom";
	System.out.println(isPalindrome(str));
	printAllpalinSS2("nnittin");
}
	public static boolean isPalindrome(String str) {
		int s =0;
		int e = str.length()-1 ;
		while(s<e) {
			//agr string or ending char match na kre to false h
			if(str.charAt(s) != str.charAt(e)) {
				return false ;
			}
			s++; e-- ;
		}
		return true;
		}
	
	
	
	
	//saare palindrome print krne k lie
	public static void printAllpalinSS2(String str) {
		for(int  c=0 ; c<str.length() ; c++) {
			grow(str,c,c);
				
			}
		}
	public static void grow(String str, int L, int R) {
		while(L >= 0 && R<str.length()) {
			if(str.charAt(L) == str.charAt(R)) {
				System.out.println(str.substring(L , R+1));
				L--;
				R++;
			}else {
				break;
			}
	}
	}
}