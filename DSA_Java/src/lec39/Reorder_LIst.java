package lec39;

public class Reorder_LIst {
public static void main(String[] args) {
	
	        ListNode head = null;
			if (head == null || head.next == null) return;
	        
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode prev = head;
	        //mid elemnt nikalne k lie or mid k dono side vali LL alg krdii
	        while (fast != null && fast.next != null) {
	            prev = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        
	        prev.next = null;
	        ListNode L1 = head;
	        ListNode L2 = reverse(slow);
	        merge(L1, L2);
	    }
	    //hmne mid k right side vali list ko reverse krdiaa
	    private static ListNode reverse(ListNode l2) {
	        ListNode prev = null;
	        while (l2 != null) {
	            ListNode next = l2.next;
	            l2.next = prev;
	            prev = l2;
	            l2 = next;
	        }
	        return prev;
	    }
	    //ab dono list ko merge krdia
	    private static void merge(ListNode l1, ListNode l2) {
	        while (l2 != null) {
	            ListNode next = l1.next;
	            l1.next = l2;
	            l1 = l2;
	            l2 = next;
	        }
	    }
	

}

