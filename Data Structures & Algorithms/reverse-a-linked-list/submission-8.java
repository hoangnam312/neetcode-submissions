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
    public static ListNode swap(ListNode prev, ListNode current) {
        ListNode next = current.next;
        current.next = prev;
        
        if (next == null) return current;

        return swap(current, next);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode reverseHead = swap(null, head);
        return reverseHead;
    }
}
