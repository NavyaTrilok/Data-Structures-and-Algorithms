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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        ListNode p3 = dummy;
        int carry = 0;
        int number = 0;
        while(l1 != null || l2 != null){
            number = 0;
            if(l1 != null){
                number += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                number += l2.val;
                l2 = l2.next;
            }
            
            number += carry;
            
            p3.next = new ListNode(number%10);
            p3 = p3.next;
            carry = number/10;
              
        }
        
         if(carry==1)
                p3.next = new ListNode(1);
        
        return dummy.next;
        
    }
}