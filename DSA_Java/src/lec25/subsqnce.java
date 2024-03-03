package lec25;

public class subsqnce {
public static void main(String[] args) {
	SS("abc" , "" );
}
public static void SS(String str , String team ) {
	if(str.isEmpty()) {
		System.out.println(team +")");
		return ;
	}
	//str = "abcd"
	//team = "Z"
	String remain = str.substring(1) ;
	char ch = str.charAt(0);
	SS(remain, team + ch);
	SS(remain , team);
}
}
