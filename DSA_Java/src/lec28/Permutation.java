package lec28;

public class Permutation {
public static void main(String[] args) {
	perm(2 , "", 4);
}
public static void perm(int r , String path , int total) {
	if(r==0) {
		System.out.println(path);
		return ;
	}
	for(int curr=0 ; curr <total ; curr++) {
		perm(r-1 ,path +"b"+curr , total);
	}
}
}
