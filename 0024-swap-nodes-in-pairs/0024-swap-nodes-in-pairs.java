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
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node before the head to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode current = dummy;
        
        while (current.next != null && current.next.next != null) {
            // Identify nodes to be swapped
            ListNode first = current.next;
            ListNode second = current.next.next;
            
            // Swap nodes
            first.next = second.next;
            second.next = first;
            current.next = second;
            
            // Move current pointer forward
            current = first;
        }
        
        return dummy.next;  // Return new head
    }
}
