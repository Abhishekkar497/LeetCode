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
          ListNode prevLeft = null;
        ListNode curr = head;

        
        for (int i = 1; i < left; i++) {
            prevLeft = curr;
            curr = curr.next;
        }

        
        ListNode tail = curr; // will become tail after reverse
        ListNode prev = null;
        ListNode temp = null;

        
        for (int i = 0; i <= right - left; i++) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        
        if (prevLeft != null) {
            prevLeft.next = prev;
        } else {
            head = prev; 
        }

        tail.next = curr;

        return head;

    }
}