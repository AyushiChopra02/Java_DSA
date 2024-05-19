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
}
