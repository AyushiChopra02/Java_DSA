package lec46;

import java.util.Collections;
import java.util.PriorityQueue;

public class heap_demo {
public static void main(String[] args) {
	//priority queue jo minimum value deti h usay min heap bolte h
	PriorityQueue<Integer> PQ = new PriorityQueue<>() ;
	
	PriorityQueue<Integer> PQ1 = new PriorityQueue<>(Collections.reverseOrder());
	//priority queue jo max  value deti h usay max heap bolte h
	
	PQ1.add(10);
	PQ1.add(4);
	PQ1.add(6);
	PQ1.add(17);
	System.out.println(PQ1.poll());
	System.out.println(PQ1.poll());
	System.out.println(PQ1.poll());
	System.out.println(PQ1.poll());
	
}
}
