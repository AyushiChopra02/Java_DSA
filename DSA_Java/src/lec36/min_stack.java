package lec36;

import lec35.Stack;

public class min_stack extends Stack {
int curr_min = Integer.MAX_VALUE;
@Override
public int pop() {
	int ali =super.pop();
	if(ali<curr_min) {
		//ali is mgcl no. and is function
		//M = 2*curr-prev
		int ans = curr_min;
		int prev_min = 2*curr_min -ali;
		curr_min = prev_min;
		return ans;
	}else {
		return ali;
	}
	//return super.peek();
}
@Override
public void add(int ali){
	if(isEmpty()) {
		curr_min = ali;
		//super mtlb jo extend kri h stack se
		super.add(ali) ;
		return;
	}
	if(ali >= curr_min) {
		super.add(ali);
	}else {
		int prev_min = curr_min;
		curr_min = ali;
		int Magical = 2*curr_min-prev_min;
		super.add(Magical);
	}
}
public int getMin() {
	return curr_min; 
}
}
