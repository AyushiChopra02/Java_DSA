package lec48;

import java.util.ArrayList;

public class Hashmap {
class Node{
	String Key;
	Integer Value;
	Node next;
}
ArrayList<Node> buckets = new ArrayList<>();
public void HashMap() {
	for(int i=0 ; i<4 ; i++) {
		buckets.add(null);
	}
}
public void put(String k , Integer V) {
	int bucket_num = hashFn(k);
}
private int hashFn(String k) {
	// TODO Auto-generated method stub
	return 0;
}

}