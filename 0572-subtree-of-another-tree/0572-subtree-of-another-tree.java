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
    
    String preorderTraversal(TreeNode node){
        if(node == null){
            return "null";
        }
        
        StringBuilder sb = new StringBuilder("^");
        sb.append(node.val);
        sb.append(preorderTraversal(node.left));
        sb.append(preorderTraversal(node.right));
        
        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        String preorderroot = preorderTraversal(root);
        String preorderSubroot = preorderTraversal(subRoot);
        
        return preorderroot.contains(preorderSubroot);
        
    }
}