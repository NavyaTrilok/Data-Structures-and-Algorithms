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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        
        int leftheight = maxDepth(root.left) ;
        int rightheight = maxDepth(root.right) ;
        
        //leftheight = leftheight+1;
        //rightheight = rightheight+1;
        
        return Math.max(leftheight, rightheight)+1;
    }
}