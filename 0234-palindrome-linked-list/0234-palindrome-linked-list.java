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
        ListNode temp;
        String s = "";
        for(temp = head; temp!=null; temp=temp.next){
            s = s + Integer.toString(temp.val);
        }

        for(int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }

        return true;
    }
}