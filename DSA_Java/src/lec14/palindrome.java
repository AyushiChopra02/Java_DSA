package lec14;
//palindrome mtlb aage se read kre ya pichese same wrd bne
public class palindrome {
	public static void main(String[] args) {
		String str = "mom";
	System.out.println(isPalindrome(str));
}
	public static boolean isPalindrome(String str) {
		int s =0;
		int e = str.length()-1;
		while(s<e) {
			//agr string or ending char match na kre to false h
			if(str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++; e--;
		}
		return true;
		
		
	}
}