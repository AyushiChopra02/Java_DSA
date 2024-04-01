package lec38;

public class linked_list {
    class Node {
        public Node(int ali) {
			// TODO Auto-generated constructor stub
		}
		int data;
        Node next;
    }

    //phle node ka nam headnode hota h
    Node head;

    public void disp() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    //jitni baar loop chlega utna mera size hoga
    public int size() {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt; // Return the count after the loop finishes
    }

    public int getFirst() {
        return head.data;
    }

    public int getLast() {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int getAt(int idx) {
        Node temp = head;
        //jitna idx h utni baar cnt
        for (int cnt = 0; cnt < idx; cnt++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public boolean isEmpty() {
    	return head == null;
    		
    }
    public void addFirst(int ali) {
    	Node nn = new Node(ali);
    	nn.next = head;
    	head = nn;
    }
    public void addLast(int ali) {
    	Node temp = head ;
    	while (temp != null && temp.next != null) {
            temp = temp.next;
    }
    	Node nn = new Node(ali);
    	temp.next = new Node(ali);
    }
}
    
