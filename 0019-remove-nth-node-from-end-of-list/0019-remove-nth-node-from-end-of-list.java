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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        System.out.println(size);
        int count = 1;
        ListNode prev = null;
        temp = head;
        while(count < (size-n)+1)
        {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if(prev == null){
            head = head.next;
            return head;
        }else{
            prev.next = prev.next.next;
            return head;
        }
            
    }
}