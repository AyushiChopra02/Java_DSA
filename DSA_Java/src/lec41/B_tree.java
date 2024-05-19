package lec41;

public class B_tree {
class Node{
	int data;
	Node left;
	Node right;
	
}
Node root;
public void disp() {
	disp(root);
}
private void disp(Node nn) {
	if(nn == null) {
		return;
	}
	//bigger prblm 10 k print krdo
	System.out.println(nn.data) ;
	disp(nn.left);
	disp(nn.right);
}
	public B_tree(int[] pre, int[] in) {
		root = createTree(pre , 0,pre.length-1,in,0,in.length-1);
}
	private Node createTree(int[] pre, int i, int j, int[] in, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}

public int size() {
	return size(root);
}
private int size(Node nn) {
	if(nn == null) {
		return 0;
	}
	int L= size(nn.left);
	int R = size(nn.right);
	return L+R+1;
}
public int Ht() {
	return Ht(root);
}
private int Ht(Node nn) {
	if(nn == null) {
		return -1;
	}
	int L = Ht(nn.left);
	int R = Ht(nn.right);
	return Math.max(L,R) + 1;
}
public int Diameter() {
	return Diameter(root);
}
private int Diameter(Node nn) {
	int L = Diameter(nn.left);
	int R = Diameter(nn.right);
	int S = 2 + Ht(nn.left) + Ht(nn.right);
	return Math.max(Math.max(L,R) , S);
}
public boolean isbal() {
	return isbal(root);
}
private boolean isbal(Node nn) {
	if (nn == null) {
		return true;
	}
	boolean L = isbal(nn.left);
	boolean R = isbal(nn.right);
	boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
	return self && L && R ;
}
}
