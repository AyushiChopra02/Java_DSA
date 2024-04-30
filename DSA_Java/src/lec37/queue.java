package lec37;

public class queue {
int arr[];
int s;
int size;
public queue() {
	this(5);
}
public queue(int cap) {
	arr = new int[cap];
}
public int size() {
	return size;
}
public boolean isFull(){
	return size()== arr.length ;
}
public boolean isEmpty(){
	return size()==0;
}
public int peek()   {
	return arr[s];
}
public void add(int ali) {
	int idx =(s+size())% arr.length ;
	arr[idx] = ali;
	size++;
}
public int poll() {
	int ans = arr[s];
	s =(s+1)%arr.length;
	size-- ;
	return ans;
}
}
