package questn;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void towerOfHanoi(int n , char src , char aux , char des) {
		if(n==1) {
			System.out.println(src + "->" + des);
			return ;
		}
		towerOfHanoi(n-1 , src , des, aux) ;
		towerOfHanoi(1 , src , aux , des);
		towerOfHanoi(n-1 , aux , src , des);
	}
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		towerOfHanoi(n , 'A' , 'B' , 'C')  ;
	}
}
