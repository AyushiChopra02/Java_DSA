package lec27;

public class Palindromic_partition {
public static void main(String[] args) {
	kaat("abcd" , "");
}
public static void kaat(String table , String bag) {
	//table = abcd
	if(table.isEmpty()) {
		System.out.println(bag);
		return;
	}
	for(int chakku =1 ; chakku <= table.length() ; chakku++ ) {
		String piece = table.substring(0, chakku);//a
		String remn = table.substring(chakku); //bcd
		kaat(remn , bag+piece +"-");
	}
}
}
