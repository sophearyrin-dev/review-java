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
    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode tmp = current.next;
            current.next = previous;
            //moving pointer
            previous = current;
            current = tmp;
        }

        return previous;
        
    }
}

// p   t
// n   1 -> 2 -> 3 -> 4 -> 5 -> null
//                         p       c


