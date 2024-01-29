package lec14;

public class string_demo {
public static void main(String[] args) {
	String str = "Hello";
	System.out.println(str.length());
	System.out.println(str.charAt(0));
	System.out.println(str.indexOf("ello"));
	//0 include hoga aur 3 mtlb end include nai hoga
	System.out.println(str.substring(0,3));
}
public static int find(String str , char ch) {
	for(int i=0 ;i<str.length(); i++) {
		if(str.charAt(i)== ch) {
			return i;
		}
	}
	return ch;

}
}
