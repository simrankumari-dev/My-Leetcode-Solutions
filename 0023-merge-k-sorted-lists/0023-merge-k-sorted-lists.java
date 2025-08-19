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
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Min heap based on node values
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add first node of each list into heap
        for (ListNode node : lists) {
            if (node != null) pq.offer(node);
        }

        // Dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {
            // Get the smallest node
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;

            // Add next node from same list into heap
            if (node.next != null) {
                pq.offer(node.next);
            }
        }

        return dummy.next;
    }
}
