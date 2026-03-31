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
    public void reorderList(ListNode head) {
        // Find the middle of the Linked List
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half of the list
        ListNode temp, prev = null;
        while(slow != null){
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        // merge the 2 halfs
        while(prev.next != null) {
            ListNode tmp1 = head.next;
            ListNode tmp2 = prev.next;
            head.next = prev;
            prev.next = tmp1;

            head = tmp1;
            prev = tmp2;
        }
    }
}
