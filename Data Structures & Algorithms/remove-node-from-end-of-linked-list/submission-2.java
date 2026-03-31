/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode slow = head, fast = head;
        // while(n != 0){
        //     fast = fast.next;
        //     n--;
        // }
        // if(fast == null) return head.next;
        // ListNode prev = null;
        // while(fast != null) {
        //     fast = fast.next;
        //     prev = slow;
        //     slow = slow.next;
        // }
        // prev.next = slow.next;
        // return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow =dummy, fast = dummy;
        for(int i = 0 ; i<= n;i++) {
            fast = fast.next;
        }
        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
