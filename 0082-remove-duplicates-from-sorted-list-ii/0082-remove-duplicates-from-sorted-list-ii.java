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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
        boolean repeat = false;
        while(curr.next!=null){
            if(curr.val == curr.next.val){
                curr = curr.next;
                repeat = true;
            }else{
                curr = curr.next;
                if(repeat==false){
                    prev = prev.next;
                }
                prev.next = curr;
                repeat = false;
            }
        }
        
        if(repeat)
            prev.next = null;
        return dummy.next;
    }
}