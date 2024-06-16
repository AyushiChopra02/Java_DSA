package lec46;

import java.util.ArrayList;

public class Heap {
ArrayList<Integer> AL;
public Heap() {
	AL = new ArrayList<>();
}
public void add(int ali) {
	AL.add(ali);	//cbt
	upheapify(AL.size()-1);
}
private void upheapify(int child) {
	
	// TODO Auto-generated method stub
	int parent = (child -1)/2;
	if(AL.get(child)<AL.get(parent)){
		swap(child , parent);
		upheapify(parent);
	}
}
private void swap(int i, int j) {
	// TODO Auto-generated method stub
	int temp = AL.get(i);
	AL.set(i,AL.get(j));
	AL.set(j ,temp);
	
}
public int peek() {
	return AL.get(0);
}
public int poll() {
	int ans = AL.get(0);
	AL.set(0, AL.get(AL.size() - 1));
	downHeapify(0);
	return ans;
}
private void downHeapify(int p) {
	// TODO Auto-generated method stub
	int L = 2 * p + 1;
	int R = 2 * p +2;
	int min = p;
	if(L < AL.size() && AL.get(min)> AL.get(L) ) {
		min = L;
	}
	if(R < AL.size() && AL.get(min)> AL.get(R) ) {
		min = R;
	}
	if(p != min) {
		swap(min, p);
		downHeapify(min);
	}
}
}
