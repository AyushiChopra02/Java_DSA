package lec25;

public class Letter_comb {
public static void main(String[] args) {
	solve("23" , "");
	
}
public static void solve(String buttons , String ans) {
	//BP : button: 246
	if(buttons.isEmpty()) {
		System.out.println(ans);
		return ;
		
	}
	String remain = buttons.substring(1);//46
	char ch = buttons.charAt(0); //2
	String op = options(ch); //abc
	for(int i=0 ; i<op.length() ; i++) {
		solve(remain , ans+op.charAt(i))  ;
	}
}
public static String options(char ch) {
	String[] arr = {"abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
	return arr[ch -'2']   ;
}
}
