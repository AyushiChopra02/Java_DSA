package lec41;

public class client {
public static void main(String[] args) {
	int[] in = {40,20,50,10,30};
	int[] pre = {10,20,30,50,60};
	B_tree BT = new B_tree(pre,in);
	//BT.disp();
	BT.lvlPrint();
}
}
 