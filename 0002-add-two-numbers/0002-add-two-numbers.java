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
        ListNode l3 = dummy;
        int num = 0;
        int carry = 0;
        
        while(l1!=null || l2!=null){
            num = 0;
            if(l1!=null){
                num = num + l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                num = num + l2.val;
                l2 = l2.next;
            }
            num = num + carry;
            
            ListNode newnode = new ListNode(num%10);
            l3.next = newnode;
            l3 = l3.next;
            carry = num/10;
        }
        
        if(carry == 1){
            l3.next = new ListNode(1);
        }
        
        return dummy.next;
        
    }
}