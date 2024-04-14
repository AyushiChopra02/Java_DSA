package lec39;

import java.util.Stack;

import lec39.client.Node;

public class k_rev {
public  void kR(int k) {
	Node head = null;
	Node curr = head ;
	Stack<Node> S = new Stack<>();
	Node nhead = null;
	Node ntail = null;
	while(curr != null) {
		Node after = curr.next;
		S.add(curr);
		if(S.size() == k) {
			// stack k elmnts  nikalo and use new LL m dalo
			while(!S.isEmpty()) {
				Node temp = S.pop();
				//add this temp at the end of ntail
				if(nhead == null) {
					nhead = temp;
					ntail = temp;
					ntail.next = null;
				}
				ntail.next = temp;
				ntail = temp;
				ntail.next = null;
			}
		}
		curr = after;
	}
}
}
