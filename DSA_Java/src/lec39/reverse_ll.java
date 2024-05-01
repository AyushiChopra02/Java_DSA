package lec39;

public class reverse_ll {
    public static void main(String[] args) {
        // Your main method logic here
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(); 
        dummy.next = head;
        ListNode prev = dummy; 
        ListNode curr = head; 
        for (int i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }
        for (int i = 0; i < right - left; i++) {
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }
        return dummy.next; 
    }
}
