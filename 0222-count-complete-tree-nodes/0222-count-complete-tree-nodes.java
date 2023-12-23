/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
     int ans = 0;
    
    public int countNodes(TreeNode root) {
        
        if(root!=null){
        
        countNodes(root.left);
        countNodes(root.right);
        
        ans=ans+1;
        
    }
        
        return ans;
        
    }
}