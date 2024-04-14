package lec39;

public class client {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
	private Node nn;

    public client() {
        this.head = null; 
    }

    public void disp() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data)  ;
            temp = temp.next;
        }
    }
    public int size1() {
    	Node temp = head;
    	int cnt =0;
    	while(temp != null) {
    		cnt ++ ;
    		temp = temp.next;
    	}
    	return cnt;
    }
    public int getFirst() {
    	if(isEmpty()) {
    		throw new RuntimeException("kya dekhra"); //agr LL khali hogi code fatjega
    	}
    	return head.data;
    }
private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
public int getLast() {
	if(isEmpty()) {
		throw new RuntimeException("kya dekhra"); //agr LL khali hogi code fatjega
	}
	Node temp = head;
	while(temp.next != null) {
		temp = temp.next;
	}
	return temp.data; 
}
public int getAt(int idx) {
	if(idx<0 || idx <= size()) {
		throw new RuntimeException("kya dekhra");
	}
	Node temp = head;
	for(int cnt = 0 ; cnt < idx ; cnt++) {
		temp = temp.next;
	}
	return temp.data;
}
private Node getNodeAt(int idx) {
	if(idx<0 || idx <= size()) {
		throw new RuntimeException("kya dekhra");
	}
	Node temp = head;
	for(int cnt =0 ; cnt< idx; cnt++) {
		temp = temp.next;
	}
	return temp;
}
	public boolean isEmpty1() {
		return head == null;
	}
public void addFirst(int ali) {
	Node nn = new Node(ali);
	nn.next = head;
	head = nn;
}
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)  {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //////////////////
    public void AddAt(int idx, int ali) {
    	if(idx<0 || idx>size()) {
    		throw new RuntimeException("kya dekhra");
    	}
    	if(idx==0) {
    		addFirst(ali);
    	}else if(idx == size()) {
    		addLast(ali);
    	}else {
    	Node nn = new Node(ali); //nn is current
    	Node prev = getNodeAt(idx-1);
    	Node after = prev.next;
    	nn.next = after;
    	prev.next = nn;
    }}
    public int removeLast() {
    	Node secondLast = getNodeAt(size1()-2); //getNodeAt fnctn h LL m jo spcfc node ko retrn krta  h like agr getNodeAt(1) likhe to 2nd node retrn krega
    	Node last = secondLast.next;
    	secondLast.next = null;
    	return last.data;
    }

	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int removeFirst() {
		if(isEmpty()) {
    		throw new RuntimeException("kya nikal ra h");
    	}
		int ans = head.data;
		head = head.next;
		return ans;
	}
	public int removeAt(int idx) {
		if(idx<0 || idx>size()) {
    		throw new RuntimeException("kya nikal ra h");
    	}
    	if(idx==0) {
    		removeFirst();
    	}else if(idx == size()-1) {
    		return removeLast();
    	}else {
		Node prev = getNodeAt(idx-1);
		Node curr = prev.next;
		Node after = curr.next;
		prev.next = after;
		
		return curr.data;
	}
		return idx;
}
	public void printRev() {
		prentRev(head);
	}

	private void prentRev(Node nn)  {
		if(nn == null) {
			return ;
		}
		Node curr = nn ;
		printRev();
		System.out.println(curr.data) ;
		return ;
	}
	public void Rev() {
		Node prev = null;
		Node curr = head ;
		while(curr != null) {
			System.out.println(curr .data);
			prev = curr ;
			 Node after = null;
			curr = after;
		}
		head = prev;
	}
	public void RevRec() {
		RevRec(head);
		
	}
	private Node RevRec(Node nn) {
		if(nn.next == null) {
			return nn;
		}
		//BP : puri LL rev kr or uski tail de
		Node curr = nn;
		Node tail = RevRec(nn.next);
		tail.next = curr ;
		curr.next = null ;
		return curr;
	}
}
