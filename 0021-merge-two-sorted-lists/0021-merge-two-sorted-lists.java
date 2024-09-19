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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode li = list2;
        ListNode ui = list1;
        ListNode dummy = new ListNode();
        dummy.val = -1;
        
        ListNode ai = dummy;
        
        while(ui!=null && li!=null){
            if(li.val < ui.val){
                ai.next = li;
                li = li.next;
            }else{
                ai.next = ui;
                ui = ui.next;
            }
            
            ai = ai.next;
        }
        
        if(ui!=null)
            ai.next = ui;
        if(li!=null)
            ai.next = li;
        
        return dummy.next;
    }
}