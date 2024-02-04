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
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        if(head.next==null)
            return true;
        
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        
        while(temp!=null){
            st.push(temp);
            temp = temp.next;
        }
        temp = head;
        ListNode node;
        while(st.empty()==false && temp!=null){
            System.out.println("here");
            node = st.pop();
            if(node.val != temp.val){
                //System.out.println("here");
                return false;
            }
                
            
            temp = temp.next;
               
        }
        
        return true;
        
    }
}