package lec24;

public class Coin_toss {
public static void main(String[] args) {
	Coin(3 , "");
}
public static void Coin(int n  , String path) {
	if(n==0) {
		System.out.println(path);
		return ;
	}
	Coin(n-1 , path+"H");
	Coin(n-1 , path +  "T");
}
}
