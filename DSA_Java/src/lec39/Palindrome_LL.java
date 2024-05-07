package lec39;

public class Palindrome_LL {
//public static void main(String[] args) {
	
	    public boolean isPalindrome(ListNode head) {
	        ListNode fast = head, slow = head;
	        
	        // Find the middle of the list
	        while (fast != null && fast.next != null) {
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        
	        // Move slow pointer to the start of the second half
	        if (fast != null) {
	            slow = slow.next ;
	        }
	        
	        // Reverse the second half of the list
	        slow = reverseList(slow);
	        fast = head;
	        
	        // Compare the reversed second half with the first half
	        while (slow != null) {
	            if (fast.val != slow.val ) {
	                return false;
	            }
	            fast = fast.next;
	            slow = slow.next;
	        }
	        
	        return true;
	    }
	    
	    private ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        ListNode curr = head;
	        
	        while (curr != null) {
	            ListNode nextTemp = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = nextTemp;
	        }
	        
	        return prev;
	    }
	

}

