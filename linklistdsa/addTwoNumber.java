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
class addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode dummy = new ListNode(0);
         ListNode cur = dummy;
         int carry = 0;
 
         while(l1 != null || l2 !=null || carry !=0){
             int x = (l1!= null) ? l1.val : 0;
             int y = (l2!= null) ? l2.val : 0;
 
             int sum = x + y + carry; //7
             carry = sum / 10; //0
             int lastDigit = sum % 10; //7
             cur.next = new ListNode(lastDigit); //7
 
             //moving pointer for next loop
             cur = cur.next;
             if(l1!=null) l1 = l1.next;
             if(l2!=null) l2 = l2.next;
         }
 
         return dummy.next;
     }
 }