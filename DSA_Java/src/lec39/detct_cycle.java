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
			return true ;
		}
	}
	return false ;
	
}
public void breakCycle()  {
	Node head = null;
	Node fast = head;
	Node slow = head ;
	while(true) {
		fast = fast.next.next ;
		slow = slow.next;
		if(fast == slow) {
			break;
		}
	}
	Node special = fast;
	Node c1 = head;
	while(c1.next != special.next) {
		c1 = c1.next;
		special = special.next;
	}
	special.next = null ;
}
}
