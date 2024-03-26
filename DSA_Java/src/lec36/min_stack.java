package lec36;

import lec35.Stack;

public class min_stack extends Stack {
int curr_min = Integer.MAX_VALUE;
@Override
public int peek() {
	int ali =super.peek();
	if(ali<curr_min) {
		//ali is mgcl no. and is function
		//M = 2*curr-prev
		return curr_min;
	}else {
		return ali;
	}
	//return super.peek();
}
@Override
public void add(int ali) {
	if(isEmpty()) {
		curr_min = ali;
		//super mtlb jo extend kri h stack se
		super.add(ali) ;
	}
}
public int getMin() {
	return curr_min; 
}
}
