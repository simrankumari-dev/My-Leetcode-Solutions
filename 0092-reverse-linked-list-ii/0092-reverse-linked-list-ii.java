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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Start reversing
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevSublist = null;

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prevSublist;
            prevSublist = curr;
            curr = next;
        }

        // Connect reversed part
        prev.next.next = curr;
        prev.next = prevSublist;

        return dummy.next;
    }
}
