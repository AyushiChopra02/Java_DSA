package lec39;

import lec39.client.Node;

public class detct_cycle {
public static boolean main(String[] args) {
	Node head = null;
	Node fast = head;
	Node slow = head;
	while(fast != null && fast.next != null) {
		fast = fast.next.next;
		slow = slow.next;
		if(fast == slow) {
			return true;
		}
	}
	return false ;
	
}
}
