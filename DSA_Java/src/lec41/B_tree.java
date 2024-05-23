package lec41;

import java.util.LinkedList;
import java.util.Queue;

public class B_tree {
class Node{
	public Node(int i) {
		// TODO Auto-generated constructor stub
	}
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
//find size of tree
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
//find height of tree
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
//find diameter of tree
public int Diameter() {
	return Diameter(root);
}
private int Diameter(Node nn) {
	int L = Diameter(nn.left);
	int R = Diameter(nn.right);
	int S = 2 + Ht(nn.left) + Ht(nn.right);
	return Math.max(Math.max(L,R) , S);
}
//find isbal
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
int pre_idx = 0;
public void Btree(int[] pre) {
	pre_idx = 0;
	root = Crpre(pre) ;
}
//create tree using preorder
private Node Crpre(int[] pre) {
	if(pre[pre_idx] == -1) {
		pre_idx++;
		return null;
	}
	// TODO Auto-generated method stub
	Node nn = new Node(pre[pre_idx]);
	pre_idx ++ ;
	nn.left = Crpre(pre);
	nn.right = Crpre(pre); 
	return nn;
}
//Depth first search/Transversal
public void lvlPrint() {
	Queue<Node> Q = new LinkedList<>();
	Q.add(root);
	while(!Q.isEmpty()) {
		Node nn = Q.poll();
		System.out.println(nn.data);
		if(nn.left!=null) {
			Q.add(nn.left);
		}
		if(nn.right!=null) {
			Q.add(nn.right) ;
		}
	}
}
class pairBST{
	boolean b = true;
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
}
private pairBST is
}

