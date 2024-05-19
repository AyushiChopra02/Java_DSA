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
}