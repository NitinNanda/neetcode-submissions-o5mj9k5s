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
        // find the middle of the LL
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half of LL
        ListNode temp = null, prev = null;
        while(slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        // merge the 2 half
        while(prev.next != null) {
            ListNode temp1 = head.next;
            ListNode temp2 = prev.next;
            head.next = prev;
            prev.next = temp1;

            head = temp1;
            prev = temp2;
        }
       // while(prev.next != null) {
        //     ListNode tmp1 = head.next;
        //     ListNode tmp2 = prev.next;
        //     head.next = prev;
        //     prev.next = tmp1;

        //     head = tmp1;
        //     prev = tmp2;
        // }
    }
}
